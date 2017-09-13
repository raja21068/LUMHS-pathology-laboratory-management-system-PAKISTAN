/*
* TestCategoriesBean.java
*
* Created on 07-Feb-2013 09:10:42 PM
*
*
* @author SAND Tech Solutions
*/

public class TestCategoriesBean{
    private int testCategoryId;
    private String testCategoryName;
    private String remarks;

    /*Constructor*/
    public TestCategoriesBean() {}

    /*Setter Methods*/
    public void setTestCategoryId(int testCategoryId){
        this.testCategoryId = testCategoryId;
    }
    public void setTestCategoryName(String testCategoryName){
        this.testCategoryName = testCategoryName;
    }
    public void setRemarks(String remarks){
        this.remarks = remarks;
    }

    /*Getter Methods*/
    public int getTestCategoryId(){
        return this.testCategoryId;
    }
    public String getTestCategoryName(){
        return this.testCategoryName;
    }
    public String getRemarks(){
        return this.remarks;
    }

    @Override
    public String toString(){
        return testCategoryName;
    }
}
