/*
* TestsBean.java
*
* Created on 07-Feb-2013 09:10:43 PM
*
*
* @author SAND Tech Solutions
*/

public class TestsBean{
    private int testId;
    private int testCategoryId;
    private String testName;
    private int testCharges;
    private String remarks;

    /*Constructor*/
    public TestsBean() {}

    /*Setter Methods*/
    public void setTestId(int testId){
        this.testId = testId;
    }
    public void setTestCategoryId(int testCategoryId){
        this.testCategoryId = testCategoryId;
    }
    public void setTestName(String testName){
        this.testName = testName;
    }
    public void setTestCharges(int testCharges){
        this.testCharges = testCharges;
    }
    public void setRemarks(String remarks){
        this.remarks = remarks;
    }

    /*Getter Methods*/
    public int getTestId(){
        return this.testId;
    }
    public int getTestCategoryId(){
        return this.testCategoryId;
    }
    public String getTestName(){
        return this.testName;
    }
    public int getTestCharges(){
        return this.testCharges;
    }
    public String getRemarks(){
        return this.remarks;
    }

    @Override
    public String toString(){
        return testName;
    }
}
