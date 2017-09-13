
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.print.Printable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.imageio.ImageIO;

/**
 *
 * @author Aahil Mehboob
 */
public class BackupReport {
    private int width=596;
    private int height=842;
    private ReportsBean reportBean;
    private Vector<String> v;
    BackupReport(ReportsBean reportBean, Vector<String> v){
        this.v = v;
        this.reportBean = reportBean;
    }
    
    public void backup(int pageNo){
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB); 
        Graphics2D g2d = bufferedImage.createGraphics();
        
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, width, height);
        
        g2d.setPaint(Color.BLACK);
            
        Font plainFont = new Font("Arial", Font.PLAIN, 10);
        Font boldFont = new Font("Arial", Font.BOLD, 10);
        
        try{
            
            //Image head = new javax.swing.ImageIcon(javax.imageio.ImageIO.read(getClass().getResource("images\\report\\head.png"))).getImage();
            //Image foot = new javax.swing.ImageIcon(javax.imageio.ImageIO.read(getClass().getResource("images\\report\\foot.png"))).getImage();
            int x = 25;
            int y = 20;
            
            //g2d.drawImage(head, x, y, 545, 70, null);
            //g2d.drawImage(foot, x, 841-80, 545, 70, null);
            
            // Printing Current Date And Time
            Font f1 = new Font("Courier New", Font.PLAIN, 10);
            
                String username = DatabaseManager.getCurrentUser();
                String currentDateTime = getCurrentDateTime();
                g2d.setFont(f1);
                g2d.drawString(currentDateTime, x+5, 841-53);
                g2d.drawString("PRINTED BY: ", x+5, 841-40);
                g2d.setFont(f1);
                g2d.drawString(username.toUpperCase() , x+75, 841-40);
                
            y+=75;
            g2d.drawLine(x, y, 565, y);
            g2d.drawLine(x, y+3, 565, y+3);
            y+=20;
            
            // Print Patient Info if only pageNo is 0 i.e. First Page
            if(pageNo==0){
               
                // Setting Receipt No
                g2d.setFont(boldFont);
                g2d.drawString("REPORT NO :  ", x+10, y);
                g2d.setFont(plainFont);
                g2d.drawString(""+reportBean.getReportId(), x+85, y);

                // Setting Date
                g2d.setFont(boldFont);
                g2d.drawString("DATE :  ", x+430, y);
                g2d.setFont(plainFont);
                g2d.drawString(DateFormatter.dateToString(reportBean.getDay()), x+470, y);
                y+=20;
                
                g2d.drawRect(x+10, y, 520, 70);
                g2d.drawRect(x+12, y+2, 516, 66);
                y+=18;
                // Setting Personal Info
                try{
                    ReciptsBean reciptBean = DatabaseManager.getReceiptAtId(reportBean.getReciptId());
                    if(reciptBean!=null){

                        PatientBean patBean = DatabaseManager.searchPatientById(reciptBean.getPatId());
                        if(patBean!=null){
                            // Setting Patient Info..
                            g2d.setFont(boldFont);
                            g2d.drawString("PATIENT ID :  ", x+30, y);
                            g2d.setFont(plainFont);
                            g2d.drawString(patBean.getPatientId(), x+100, y);
                            y+=14;
                            g2d.setFont(boldFont);
                            g2d.drawString("NAME :  ", x+30, y);
                            g2d.setFont(plainFont);
                            g2d.drawString(patBean.getPatientFirstName() + " " + patBean.getPatientLastName(), x+100, y);
                            y+=14;
                            g2d.setFont(boldFont);
                            g2d.drawString("GENDER :  ", x+30, y);
                            g2d.setFont(plainFont);
                            g2d.drawString(Decoder.genderDecode(patBean.getGender()), x+100, y);
                            y+=14;
                            g2d.setFont(boldFont);
                            g2d.drawString("AGE : ", x+30, y);
                            g2d.setFont(plainFont);
                            g2d.drawString(""+patBean.getAge(), x+100, y);
                            y+=14;
                        }
                        
                        DoctorBean docBean = DatabaseManager.searchDoctorById(reciptBean.getDoctorId());
                        if(docBean!=null){
                            y-=56;
                            // Setting lab, Specimen & Doctor..
                            g2d.setFont(boldFont);
                            g2d.drawString("LAB NO :  ", x+270, y);
                            g2d.setFont(plainFont);
                            g2d.drawString(reportBean.getLabNo(), x+360, y);
                            y+=14;
                            g2d.setFont(boldFont);
                            g2d.drawString("SPECIMEN :  ", x+270, y);
                            g2d.setFont(plainFont);
                            g2d.drawString(reportBean.getSpecimen(), x+360, y);
                            y+=14;
                            g2d.setFont(boldFont);
                            g2d.drawString("REFERRED BY :  ", x+270, y);
                            g2d.setFont(plainFont);
                            g2d.drawString(docBean.getDoctorName(), x+360, y);
                            y+=28;
                        }

                        y+=25;
                        Font temp = new Font("Arail", Font.BOLD, 15);
                        g2d.setFont(temp);
                        g2d.drawString(reportBean.getSpecimen().toUpperCase() + " EXAMINATION REPORT", x+150, y);
                        y+=20;
                    }
                }catch(Exception ex){ex.printStackTrace();}
               
                
            }
            
                int x1 = x+20;
                int x2 = x+200;
                int x3 = x+350;
                
                g2d.setFont(boldFont);
                g2d.drawRect(x+10, y, 520, 20);
                
                g2d.drawString("Test", x1, y+13);
                g2d.drawLine(x2-10, y, x2-10, y+20);
                g2d.drawString("Result", x2, y+13);
                g2d.drawLine(x3-10, y, x3-10, y+20);
                g2d.drawString("Range", x3, y+13);
                y+=40;         
                // 32 more line are printable, so make sure hat Vector size is 32.
                // single semi-colon split entire line;
                for(int k=0 ; k<v.size(); k++){
                    
                    String line = v.elementAt(k);
                    if(line.equals(""+Constants.WIDAL)){
                        itsWidal(g2d, v);
                        return;
                    }
                    
                    // if some heading...
                    if(line.startsWith("#")){
                        g2d.setFont(boldFont);
                        String s[] = line.split(";");
                        if(s.length==3){
                            g2d.drawString(s[0].substring(1, s[0].length()), x1, y);
                            g2d.drawString(s[1], x2, y);
                            g2d.drawString(s[2], x3, y);
                        }
                        else{
                            g2d.drawString(line.substring(1, line.length()).replaceAll(";", ""), x1, y);
                        }
                        y+=14;
                    }
                    
                    // noraml parameter...
                    else{
                        g2d.setFont(plainFont);
                        String s[] = line.split(";");
                        if(s.length==3){                 
                            g2d.drawString(s[0], x1, y);
                            g2d.drawString(s[1], x2, y);
                            g2d.drawString(s[2], x3, y);
                        }
                        else{
                            g2d.drawString(line, x1, y);
                        }
                        y+=14;
                    }
                }

                g2d.dispose();
                File dir = new File("d://jpeg//Reports//"+DateFormatter.dateToString(reportBean.getDay()));
                if(!dir.exists())
                    dir.mkdirs();
                File file = new File(dir.getAbsoluteFile() + "//" + reportBean.getReportId() + ".bak");
                int k=1;
                while(file.exists()){
                    k++;
                    file = new File(dir.getAbsoluteFile() + "//" + reportBean.getReportId() + "-" + k + ".bak");
                }
                FileOutputStream fileOut = new FileOutputStream(file);
                ImageIO.write(bufferedImage, "jpeg", fileOut);
                fileOut.close();
                
        } catch (Exception ex) {ex.printStackTrace();}
    }
    
    private void itsWidal(Graphics2D g2d, Vector<String> v){
        Image widalImage = new javax.swing.ImageIcon("images\\widal-r.png").getImage();
        g2d.drawImage(widalImage, 35, 300, 520, 165, null);
        int y = 382;
        for(int k=1 ; k<=4 ; k++){
            String s[] = v.elementAt(k).split(";");
            g2d.drawString(s[0], 390, y);
            g2d.drawString(s[1], 425, y);
            g2d.drawString(s[2], 460, y);
            g2d.drawString(s[3], 495, y);
            g2d.drawString(s[4], 530, y);
            y+=20;
        }
        if(v.size()>5){
            g2d.setFont(new Font("Arial", Font.BOLD, 10));
            g2d.drawString(v.elementAt(5), 50, y);
        }
    }
    
    private String getCurrentDateTime(){
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy  hh:mm:ss a");
	   //get current date time with Date()
	   Date date = new Date();
	   return dateFormat.format(date);
    }
}
