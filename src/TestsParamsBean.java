/*
* TestsParamsBean.java
*
* Created on 07-Feb-2013 09:10:43 PM
*
*
* @author SAND Tech Solutions
*/

public class TestsParamsBean{
    private int testParamsId;
    private int testId;
    private String testParamsName;
    private String testParamsRange;
    private int reportDetailId;


    /*Constructor*/
    public TestsParamsBean() {}

    /*Setter Methods*/
    public void setTestParamsId(int testParamsId){
        this.testParamsId = testParamsId;
    }
    public void setTestId(int testId){
        this.testId = testId;
    }
    public void setTestParamsName(String testParamsName){
        this.testParamsName = testParamsName;
    }
    public void setTestParamsRange(String testParamsRange){
        this.testParamsRange = testParamsRange;
    }

    public void setReportDetailId(int reportDetailId) {
        this.reportDetailId = reportDetailId;
    }


    /*Getter Methods*/
    public int getTestParamsId(){
        return this.testParamsId;
    }
    public int getTestId(){
        return this.testId;
    }
    public String getTestParamsName(){
        return this.testParamsName;
    }
    public String getTestParamsRange(){
        return this.testParamsRange;
    }
    public int getReportDetailId() {
        return reportDetailId;
    }


    @Override
    public String toString(){
        return testParamsName;
    }
}
