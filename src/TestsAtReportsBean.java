/**
 *
 * @author Aahil Mehboob
 */
public class TestsAtReportsBean {
    private int testAtReportId;
    private int reportId;
    private int testId;
    private int generated;
    
    @Override
    public String toString(){
        String testName = "";
        try{
            TestsBean bean = DatabaseManager.getTestAtId(testId);
            testName = bean.getTestName();
        }catch(Exception ex){ex.printStackTrace();}
        return testName;
    }
    
    public void setTestAtReportId(int testAtReportId){
        this.testAtReportId = testAtReportId;
    }
    public void setReportId(int reportId){
        this.reportId = reportId;
    }
    public void setTestId(int testId){
        this.testId = testId;
    }
    public void setGenerated(int generated){
        this.generated = generated;
    }
    
    public int getTestAtReportId(){
        return testAtReportId;
    }
    public int getReportId(){
        return reportId;
    }
    public int getTestId(){
        return testId;
    }
    public int getGenerated(){
        return generated;
    }
    
}
