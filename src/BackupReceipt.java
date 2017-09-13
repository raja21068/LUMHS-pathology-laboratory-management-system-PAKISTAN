import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
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
public class BackupReceipt {
    
    private int width=420;
    private int height=595;
    private ReciptsBean reciptBean;
    BackupReceipt(ReciptsBean reciptBean){
        this.reciptBean = reciptBean;
    }
    
    public void backup(){
         
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB); 
        Graphics2D g2d = bufferedImage.createGraphics();
        
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, width, height);
        
        try {
            g2d.setPaint(Color.BLACK);
            
            Font plainFont = new Font("Arial", Font.PLAIN, 10);
            Font boldFont = new Font("Arial", Font.BOLD, 10);
            
            //Image head = new javax.swing.ImageIcon(javax.imageio.ImageIO.read(getClass().getResource("images\\receipt\\head.png"))).getImage();
            //Image foot = new javax.swing.ImageIcon(javax.imageio.ImageIO.read(getClass().getResource("images\\receipt\\foot.png"))).getImage();
            int x = 20;
            int y = 20;
            
            //g2d.drawImage(head, x, y, 380, 60, null);
            y+=65;
            g2d.drawLine(x, y, 400, y);
            g2d.drawLine(x, y+2, 400, y+2);
            y+=20;
            
            g2d.setFont(boldFont);
            // Setting Receipt No
            g2d.drawString("RECEIPT NO :  ", x+5, y);
            g2d.setFont(plainFont);
            g2d.drawString(""+reciptBean.getReciptId(), x+80, y);
            
            // Setting Date
            g2d.setFont(boldFont);
            g2d.drawString("DATE :  ", x+280, y);
            g2d.setFont(plainFont);
            g2d.drawString(getDate(reciptBean.getDayId()) , x+320, y);
            y+=20;
            
            try{
                PatientBean patBean = DatabaseManager.searchPatientById(reciptBean.getPatId());
                if(patBean!=null){
                    // Setting Patient Info..
                    g2d.setFont(boldFont);
                    g2d.drawString("PATIENT ID :  ", x+5, y);
                     g2d.setFont(plainFont);
                    g2d.drawString(patBean.getPatientId(), x+90, y);
                    y+=10;
                    g2d.setFont(boldFont);
                    g2d.drawString("NAME :  ", x+5, y);
                     g2d.setFont(plainFont);
                    g2d.drawString(patBean.getPatientFirstName() + " " + patBean.getPatientLastName(), x+90, y);
                    y+=10;
                    g2d.setFont(boldFont);
                    g2d.drawString("GENDER :  ", x+5, y);
                     g2d.setFont(plainFont);
                    g2d.drawString(Decoder.genderDecode(patBean.getGender()), x+90, y);
                    y+=10;
                    g2d.setFont(boldFont);
                    g2d.drawString("AGE : ", x+5, y);
                     g2d.setFont(plainFont);
                    g2d.drawString(""+patBean.getAge(), x+90, y);
                    y+=10;
                }
                
                DoctorBean docBean = DatabaseManager.searchDoctorById(reciptBean.getDoctorId());
                if(docBean!=null){
                    g2d.setFont(boldFont);
                    g2d.drawString("REFFERED BY : ", x+5, y);
                     g2d.setFont(plainFont);
                    g2d.drawString(docBean.getDoctorName(), x+90, y);
                    y+=10;
                }
                
                g2d.drawLine(x, y, 400, y);
                y+=10;
                g2d.setFont(boldFont);
                g2d.drawString("Tests", x+5, y);
                g2d.drawString("Charges", x+290, y);
                y+=6;
                g2d.drawLine(x, y, 400, y);
                y+=15;
                
                g2d.setFont(plainFont);
                Vector<TestAtReciptBean> v = DatabaseManager.getAllTestAtRecipt(reciptBean.getReciptId());
                int totalCharges = 0;
                for(int k=0 ; k<v.size() ; k++){
                    TestAtReciptBean testAtReciptBean = v.elementAt(k);
                    TestsBean testBean = DatabaseManager.getTestAtId(testAtReciptBean.getTestId());
                    
                    String testName = testBean.getTestName();
                    int charges = testAtReciptBean.getCharges();
                    totalCharges += charges;
                    g2d.drawString(testName, x+5, y);
                    g2d.drawString(""+charges, x+300, y);
                    y+=12;
                }
                y-=2;
                g2d.drawLine(x, y, 400, y);
                y+=12;
                g2d.setFont(boldFont);
                g2d.drawString("EXPECTED DATE : ", x+5, y);
                g2d.setFont(plainFont);
                g2d.drawString(DateFormatter.dateToString(reciptBean.getExpectedDate()), x+100, y);
                g2d.setFont(boldFont);
                g2d.drawString("TOTAL :", x+260, y);
                g2d.setFont(plainFont);
                g2d.drawString(""+totalCharges, x+300, y);
                
                y+=10;
                if(reciptBean.getDues()>0){
                    g2d.setFont(boldFont);
                    g2d.drawString("DUES :", x+260, y);
                    g2d.setFont(plainFont);
                    g2d.drawString(""+reciptBean.getDues(), x+300, y);
                }
                
                
                Font f1 = new Font("Courier New", Font.PLAIN, 10);
                
                String currentDateTime = getCurrentDateTime();
                String username =  DatabaseManager.getCurrentUser();
                g2d.setFont(f1);
                g2d.drawString("PRINTED BY: ", x+5, 555);
                g2d.setFont(f1);
                g2d.drawString(username.toUpperCase(), x+75, 555);
                g2d.drawString(currentDateTime, x+240, 555);
                //g2d.drawImage(foot, x, 560, 390, 20, null);
                
            }catch(Exception ex){ex.printStackTrace();}
        
            g2d.dispose();
            File dir = new File("d://jpeg//Receipts//"+getDate(reciptBean.getDayId()));
            if(!dir.exists())
                dir.mkdirs();
            File file = new File(dir.getAbsoluteFile() + "//" + reciptBean.getReciptId() + ".bak");
            int k=1;
            while(file.exists()){
                k++;
                file = new File(dir.getAbsoluteFile() + "//" + reciptBean.getReciptId() + "-" + k + ".bak");
            }
            FileOutputStream fileOut = new FileOutputStream(file);
            ImageIO.write(bufferedImage, "jpeg", fileOut);
            fileOut.close();
        } catch (IOException ex) { ex.printStackTrace(); }
    }
    
    private String getDate(int dayId){
        String date = "";
        try{
            DaysBean daysBean = DatabaseManager.getDayAtId(dayId);
            if(daysBean==null)   return "";
            
            date = DateFormatter.dateToString(daysBean.getDay());
        }catch(Exception ex){ex.printStackTrace();}
        return date;
    }
    
    
    
    private String getCurrentDateTime(){
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy  hh:mm:ss a");
	   //get current date time with Date()
	   Date date = new Date();
	   return dateFormat.format(date);
    }
}
