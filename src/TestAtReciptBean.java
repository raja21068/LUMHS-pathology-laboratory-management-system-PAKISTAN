/*
* TestAtReciptBean.java
*
* Created on 07-Feb-2013 09:10:42 PM
*
*
* @author SAND Tech Solutions
*/

public class TestAtReciptBean{
    private int testAtReciptId;
    private int reciptId;
    private int testId;
    private int charges;

    /*Constructor*/
    public TestAtReciptBean() {}

    /*Setter Methods*/
    public void setTestAtReciptId(int testAtReciptId){
        this.testAtReciptId = testAtReciptId;
    }
    public void setReciptId(int reciptId){
        this.reciptId = reciptId;
    }
    public void setTestId(int testId){
        this.testId = testId;
    }
    public void setCharges(int charges){
        this.charges = charges;
    }
    /*Getter Methods*/
    public int getTestAtReciptId(){
        return this.testAtReciptId;
    }
    public int getReciptId(){
        return this.reciptId;
    }
    public int getTestId(){
        return this.testId;
    }
    public int getCharges(){
        return this.charges;
    }
    
    @Override
    public String toString(){
        String testName = "";
        try{
            testName = DatabaseManager.getTestAtId(this.testId).getTestName();
        }catch(Exception ex){ex.printStackTrace();}
        return testName;
    }
}
