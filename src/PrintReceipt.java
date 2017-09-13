
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author Aahil Mehboob
 */
public class PrintReceipt implements Printable{
    
    private ReciptsBean reciptBean;
    PrintReceipt(ReciptsBean reciptBean){
        this.reciptBean = reciptBean;
    }
    
    public static PageFormat getReceiptPageFormat(){
        PageFormat pageFormat = new PageFormat();
        Paper paper = new Paper();
        
        double width = 420;
        double height = 595;
        
        paper.setSize(width, height);
        paper.setImageableArea(0, 0, width, height);
        pageFormat.setPaper(paper);
        pageFormat.setOrientation(PageFormat.PORTRAIT);
        
        return pageFormat;
    } 
    
    
    
    @Override
    public int print(Graphics g, PageFormat pageFormat, int pageNo){
        try {
            Graphics2D g2d = (Graphics2D)g;
            g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
            g2d.setPaint(Color.BLACK);
            
            Font plainFont = new Font("Arial", Font.PLAIN, 8);
            Font boldFont = new Font("Arial", Font.BOLD, 8);
            
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
            g2d.drawString(""+reciptBean.getReciptId(), x+60, y);
            
            // Setting Date
            g2d.setFont(boldFont);
            g2d.drawString("DATE :  ", x+300, y);
            g2d.setFont(plainFont);
            g2d.drawString(getDate(reciptBean.getDayId()) , x+330, y);
            y+=20;
            
            try{
                PatientBean patBean = DatabaseManager.searchPatientById(reciptBean.getPatId());
                if(patBean!=null){
                    // Setting Patient Info..
                    g2d.setFont(boldFont);
                    g2d.drawString("PATIENT ID :  ", x+5, y);
                     g2d.setFont(plainFont);
                    g2d.drawString(patBean.getPatientId(), x+80, y);
                    y+=10;
                    g2d.setFont(boldFont);
                    g2d.drawString("NAME :  ", x+5, y);
                     g2d.setFont(plainFont);
                    g2d.drawString(patBean.getPatientFirstName() + " " + patBean.getPatientLastName(), x+80, y);
                    y+=10;
                    g2d.setFont(boldFont);
                    g2d.drawString("GENDER :  ", x+5, y);
                     g2d.setFont(plainFont);
                    g2d.drawString(Decoder.genderDecode(patBean.getGender()), x+80, y);
                    y+=10;
                    g2d.setFont(boldFont);
                    g2d.drawString("AGE : ", x+5, y);
                     g2d.setFont(plainFont);
                    g2d.drawString(""+patBean.getAge(), x+80, y);
                    y+=10;
                }
                
                DoctorBean docBean = DatabaseManager.searchDoctorById(reciptBean.getDoctorId());
                if(docBean!=null){
                    g2d.setFont(boldFont);
                    g2d.drawString("REFFERED BY : ", x+5, y);
                     g2d.setFont(plainFont);
                    g2d.drawString(docBean.getDoctorName(), x+80, y);
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
                g2d.drawString(DateFormatter.dateToString(reciptBean.getExpectedDate()), x+80, y);
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
                
                
                Font f1 = new Font("Courier New", Font.PLAIN, 8);
                
                String currentDateTime = getCurrentDateTime();
                String username =  DatabaseManager.getCurrentUser();
                g2d.setFont(f1);
                g2d.drawString("PRINTED BY: ", x+5, 555);
                g2d.setFont(f1);
                g2d.drawString(username.toUpperCase(), x+65, 555);
                g2d.drawString(currentDateTime, x+265, 555);
                //g2d.drawImage(foot, x, 560, 390, 20, null);
                
            }catch(Exception ex){ex.printStackTrace(System.err);}
            
        } catch (Exception ex) { ex.printStackTrace(System.err); }
        
        return Printable.PAGE_EXISTS;
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
