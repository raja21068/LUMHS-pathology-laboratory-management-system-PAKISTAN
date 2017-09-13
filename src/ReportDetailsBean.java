/*
* ReportDetailsBean.java
*
* Created on 07-Feb-2013 09:10:41 PM
*
*
* @author SAND Tech Solutions
*/

public class ReportDetailsBean{
    private int reportDetailId;
    private int testAtReportId;
    private int testParamId;
    private String testResult;
    private String manualHeading;

    /*Constructor*/
    public ReportDetailsBean() {}

    /*Setter Methods*/
    public void setReportDetailId(int reportDetailId){
        this.reportDetailId = reportDetailId;
    }
    public void setTestAtReportId(int testAtReportId){
        this.testAtReportId = testAtReportId;
    }
    public void setTestParamId(int testParamId){
        this.testParamId = testParamId;
    }
    public void setTestResult(String testResult){
        this.testResult = testResult;
    }
    public void setManualHeading(String manualHeading){
        this.manualHeading = manualHeading;
    }

    /*Getter Methods*/
    public int getReportDetailId(){
        return this.reportDetailId;
    }
    public int getTestAtReportId(){
        return this.testAtReportId;
    }
    public int getTestParamId(){
        return this.testParamId;
    }
    public String getTestResult(){
        return this.testResult;
    }
    public String getManualHeading(){
        return this.manualHeading;
    }

    @Override
    public String toString(){
        return "";
    }
}
