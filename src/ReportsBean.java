/*
* ReportsBean.java
*
* Created on 07-Feb-2013 09:10:41 PM
*
*
* @author SAND Tech Solutions
*/

public class ReportsBean{
    private int reportId;
    private int reciptId;
    private java.util.Date day;
    private String labNo;
    private String specimen;
    private int generated;

    /*Constructor*/
    public ReportsBean() {}

    /*Setter Methods*/
    public void setReportId(int reportId){
        this.reportId = reportId;
    }
    public void setReciptId(int reciptId){
        this.reciptId = reciptId;
    }
    public void setDay(java.util.Date day){
        this.day = day;
    }
    public void setLabNo(String labNo){
        this.labNo = labNo;
    }
    public void setSpecimen(String specimen){
        this.specimen = specimen;
    }
    public void setGenerated(int generated){
        this.generated = generated;
    }
    
    /*Getter Methods*/
    public int getReportId(){
        return this.reportId;
    }
    public int getReciptId(){
        return this.reciptId;
    }
    public java.util.Date getDay(){
        return this.day;
    }
    public String getLabNo(){
        return this.labNo;
    }
    public String getSpecimen(){
        return this.specimen;
    }
    public int getGenerated(){
        return generated;
    }

    @Override
    public String toString(){
        return ""+reciptId;
    }
}
