/*
* ReciptsBean.java
*
* Created on 07-Feb-2013 09:10:40 PM
*
*
* @author SAND Tech Solutions
*/

public class ReciptsBean{
    private int reciptId;
    private int manualRecId;
    private String patId;
    private String doctorId;
    private int dayId;
    private java.util.Date expectedDate;
    private int dues;
    private int discounts;
    private int total;
    private String testName;

    /*Constructor*/
    public ReciptsBean() {}

    /*Setter Methods*/
    public void setReciptId(int reciptId){
        this.reciptId = reciptId;
    }
    public void setPatId(String patId){
        this.patId = patId;
    }
    public void setDoctorId(String doctorId){
        this.doctorId = doctorId;
    }
    public void setDayId(int dayId){
        this.dayId = dayId;
    }
    public void setExpectedDate(java.util.Date expectedDate){
        this.expectedDate = expectedDate;
    }
    public void setDues(int dues){
        this.dues = dues;
    }
    public void setDiscounts(int discounts){
        this.discounts = discounts;
    }
    public void setTotal(int total){
        this.total = total;
    }
    public void setTestName(String testName){
        this.testName = testName;
    }
    public void setManualRecId(int manualRecId) {
        this.manualRecId = manualRecId;
    }

    /*Getter Methods*/
    public int getReciptId(){
        return this.reciptId;
    }
    public String getPatId(){
        return this.patId;
    }
    public String getDoctorId(){
        return this.doctorId;
    }
    public int getDayId(){
        return this.dayId;
    }
    public java.util.Date getExpectedDate(){
        return this.expectedDate;
    }
    public int getDues(){
        return this.dues;
    }
    public int getDiscounts(){
        return this.discounts;
    }
    public int getTotal(){
        return this.total;
    }
    public String getTestName(){
        return this.testName;
    }
    public int getManualRecId() {
        return manualRecId;
    }
    @Override
    public String toString(){
        return "";
    }
}
