import java.io.DataInputStream;
import java.io.FileInputStream;
import java.sql.*;
import java.util.Vector;

//'* @author SAND Tech Solutions

class DatabaseManager{
    
public static java.sql.Connection connection;

static{
   try{
       String ip = getIp();
//       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//     connection = java.sql.DriverManager.getConnection("Jdbc:Odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=Lab.mdb");
     
       Class.forName("oracle.jdbc.driver.OracleDriver");
       connection = DriverManager.getConnection("jdbc:oracle:thin:@"+ip+":1521:XE", "lab", "lab");
     
     } catch(Exception e){ e.printStackTrace(System.err); }
  }

private static String getIp(){
    String ip = "192.168.1.20";
    try{
        DataInputStream in = new DataInputStream(new FileInputStream("ip.txt"));
        ip = in.readLine();
    }catch(Exception ex){ex.printStackTrace();}
    return ip;
}


//----------------Queries of days table----------------
public static Vector getAllDays()throws  Exception{
    String query = "SELECT * FROM days ORDER BY day DESC";
    System.out.println(query);
    Vector vec = new Vector();
    Statement st = connection.createStatement();
    ResultSet result = st.executeQuery(query);
    int counter = 1;
    while(result.next() && counter<=30){
        DaysBean rec = new DaysBean();
        rec.setDayId(result.getInt("day_id"));
        rec.setDay(result.getDate("day"));
        rec.setDues(result.getInt("dues"));
        rec.setDiscount(result.getInt("discount"));
        rec.setBalance(result.getInt("balance"));
        rec.setClosed(result.getInt("closed"));
        rec.setRemarks(result.getString("remarks"));
        vec.addElement(rec);
        counter++;
    }//end of while
    result.close();
    st.close();
    return vec;
   }


public static int addDays(int dayId, String day, int dues, int discount, int balance, int closed, String remarks)throws  Exception{
    String query = "INSERT INTO days(day_id, day, dues, discount, balance, closed, remarks) VALUES ("+dayId+", '"+day+"', "+dues+", "+discount+", "+balance+", "+closed+", '"+remarks+"')";
    System.out.println(query);
    Statement st = connection.createStatement();
    int r = st.executeUpdate(query);
    st.close();
    return r;
}


public static int updateDays(int dayId, String day, int dues, int discount, int balance, int closed, String remarks)throws  Exception{     
    String query = "UPDATE days SET day='"+day+"', dues="+dues+", discount="+discount+", balance="+balance+", closed="+closed+", remarks='"+remarks+"' WHERE day_id="+dayId;
    System.out.println(query);
    Statement st = connection.createStatement();
    int r = st.executeUpdate(query);
    st.close();
    return r;
}

public static int updateDayBalanaceAndDiscount(int dayId, int discount, int balance)throws  Exception{     
    String query = "UPDATE days SET discount=discount-"+discount+", balance=balance-"+balance+" WHERE day_id="+dayId;
    System.out.println(query);
    Statement st = connection.createStatement();
    int r = st.executeUpdate(query);
    st.close();
    return r;
}

public static int updateDayDues(int dayId, int dues)throws  Exception{     
    String query = "UPDATE days SET dues=dues-"+dues+" WHERE day_id="+dayId;
    System.out.println(query);
    Statement st = connection.createStatement();
    int r = st.executeUpdate(query);
    st.close();
    return r;
}

public static int clearDayDues(int dues, int dayId)throws  Exception{
    String query = "UPDATE days SET dues="+dues+" WHERE day_id="+dayId;
    System.out.println(query);
    Statement st = connection.createStatement();
    int r = st.executeUpdate(query);
    st.close();
    return r;
}

public static int deleteDays(int dayId)throws  Exception{
    String query = "DELETE FROM days WHERE day_id="+dayId;
    System.out.println(query);
    Statement st = connection.createStatement();
    int r = st.executeUpdate(query);
    st.close();
    return r;
}

public static int getMaxDayId()throws Exception{
    String query = "SELECT MAX(day_id) AS id FROM days";
    System.out.println(query);
    Statement st = connection.createStatement();
    ResultSet rs = st.executeQuery(query);
    int id = 1;
    if(rs.next())
        id = rs.getInt("id");
    rs.close();
    st.close();
    return id;
}

public static DaysBean getDayAtId(int dayId)throws Exception{
    String query = "SELECT * FROM days WHERE day_id="+dayId;
    System.out.println(query);
    DaysBean bean = null;
    Statement st = connection.createStatement();
    ResultSet result = st.executeQuery(query);
      if(result.next()){
       bean = new DaysBean();
           bean.setDayId(result.getInt("day_id"));
           bean.setDay(result.getDate("day"));
           bean.setDues(result.getInt("dues"));
           bean.setDiscount(result.getInt("discount"));
           bean.setBalance(result.getInt("balance"));
           bean.setClosed(result.getInt("closed"));
           bean.setRemarks(result.getString("remarks"));
      }//end of while
     result.close();
     st.close();
    return bean;
}

public static Vector daySummaryDatewise(String fromDate, String toDate)throws  Exception{
  String query = "SELECT * FROM days WHERE day>='"+fromDate+"' AND day<='"+toDate+"'";
      System.out.println(query);
      Vector vec = new java.util.Vector();
      Statement st = connection.createStatement();
      ResultSet result = st.executeQuery(query);
           while(result.next()){
           DaysBean bean= new DaysBean();
           bean.setDues(result.getInt("dues"));
           bean.setDiscount(result.getInt("discount"));
           bean.setBalance(result.getInt("balance"));
           vec.addElement(bean);
        }
        result.close();
        st.close();
        return vec;
    }

//----------------Queries of doctors table----------------
public static Vector getDoctors()throws Exception{
        String query = "SELECT * FROM doctors ORDER BY doc_name ASC";
        System.out.println(query);
        Vector v = new Vector();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                DoctorBean bean = new DoctorBean();
                bean.setDoctorId(rs.getString("doctor_id"));
                bean.setDoctorName(rs.getString("doc_name"));
                bean.setDoctorContact(rs.getString("doc_contact"));
                bean.setRemarks(rs.getString("remarks"));
                v.addElement(bean);
            }
        rs.close();
        st.close();
        return v;
    }
 
public static DoctorBean searchDoctorById(String docId)throws Exception{
        String query = "SELECT * FROM doctors WHERE doctor_id='"+docId+"'";
        System.out.println(query);
        DoctorBean bean = null;
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
            if(rs.next()){
                bean = new DoctorBean();
                bean.setDoctorId(rs.getString("doctor_id"));
                bean.setDoctorName(rs.getString("doc_name"));
                bean.setDoctorContact(rs.getString("doc_contact"));
                bean.setRemarks(rs.getString("remarks"));
            }
        rs.close();
        st.close();
        return bean;
    }

    public static int insertDoctor(String doctor_id, String doctor_name, String contact, String remarks)throws Exception{
        String query = "INSERT INTO doctors(doctor_id, doc_name, doc_contact, remarks) VALUES('"+doctor_id+"','"+doctor_name+"','"+contact+"','"+remarks+"')";
        System.out.println(query);
        int r=0;
        Statement st = connection.createStatement();
        r = st.executeUpdate(query);
        st.close();
        return r;
    }
    
     public static int deleteDoctor(String doctor_id)throws Exception{
        String query = "DELETE FROM doctors WHERE doctor_id='"+doctor_id+"'";
        System.out.println(query);
        int r=0;
        Statement st = connection.createStatement();
        r = st.executeUpdate(query);
        st.close();
        return r;
    }
    
    public static int updateDoctor(String doctor_id, String doctor_name, String contact, String remarks)throws Exception{
        String query = "UPDATE doctors SET doc_name='"+doctor_name+"', doc_contact='"+contact+"', remarks='"+remarks+"' WHERE doctor_id='"+doctor_id+"'";
        System.out.println(query);
        int r=0;
        Statement st = connection.createStatement();
        r = st.executeUpdate(query);
        st.close();
        return r;
    }

    public static String getMaxDocId()throws Exception{
        String query = "SELECT MAX(doctor_id) AS id FROM doctors";
        System.out.println(query);
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        String id = "DOC01";
        if(rs.next())
            if(rs.getString("id")!=null)
                id = rs.getString("id");
        rs.close();
        st.close();
        return id;
    }
   
//----------------Queries of Patient Searches---------------- 
    
    public static int insertPatient(String patId, String patFName, String patLName, int age, int gender,String contact, int dues, String remarks)throws Exception{
        String query = "INSERT INTO patients(pat_id, pat_first_name, pat_last_name, pat_age, pat_gender, pat_contact, dues, remarks) VALUES('"+patId+"','"+patFName+"','"+patLName+"',"+age+","+gender+",'"+contact+"',"+dues+",'"+remarks+"')";
        System.out.println(query);
        Statement st = connection.createStatement();
        int r = st.executeUpdate(query);
        st.close();
        return r;
    }
 
    
    public static int updatePatient(String patId,String patFName, String patLName, int age, int gender, String contact, int dues, String remarks)throws Exception{
        String query = "UPDATE Patients SET pat_first_name='"+patFName+"', pat_last_name='"+patLName+"', pat_age="+age+", pat_gender="+gender+", pat_contact='"+contact+"', dues="+dues+", remarks='"+remarks+"' WHERE pat_id='"+patId+"'";
        System.out.println(query);
        Statement st = connection.createStatement();
        int r = st.executeUpdate(query);
        st.close();
        return r;
    }
    
    public static int updatePatientDues(String patId, int dues)throws Exception{
        String query = "UPDATE Patients SET dues=dues-"+dues+" WHERE pat_id='"+patId+"'";
        System.out.println(query);
        Statement st = connection.createStatement();
        int r = st.executeUpdate(query);
        st.close();
        return r;
    }
    
    public static int deletePatient(String patId)throws Exception{
        String query = "DELETE FROM Patients WHERE pat_id='"+patId+"'";
        System.out.println(query);
        Statement st = connection.createStatement();
        int r = st.executeUpdate(query);
        st.close();
        return r;
    }
    
    public static int clearPatientDues(int dues, String patId)throws Exception{
        String query = "UPDATE Patients SET dues="+dues+" WHERE pat_id='"+patId+"'";
        System.out.println(query);
        int r = 0;
        Statement st = connection.createStatement();
        r = st.executeUpdate(query);
        st.close();
        return r;
    }
    
    public static String getMaxPatId()throws Exception{
        String query = "SELECT MAX(pat_id) AS id FROM PATIENTS";
        System.out.println(query);
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        String id = "PAT00";
        if(rs.next()){
            if(rs.getString("id")!=null)
                id = rs.getString("id");
        }
            rs.close();
            st.close();
        return id;
    }
    
   public static Vector getPatientTests(String patId)throws Exception{
       String query = "SELECT * FROM recipts r, test_at_recipt tr , tests t, days d WHERE r.pat_id='"+patId+"' AND r.recipt_id=tr.recipt_id AND t.test_id=tr.test_id AND d.day_id=r.day_id";
       System.out.println(query);
       Vector v = new Vector();
       Statement st =connection.createStatement();
       ResultSet result = st.executeQuery(query);
       while(result.next()){
           ReciptsBean bean = new ReciptsBean();
           bean.setReciptId(result.getInt("recipt_id"));
           bean.setExpectedDate(result.getDate("day"));
           bean.setTestName(result.getString("test_name"));
           v.addElement(bean);
       }
       result.close();
       st.close();
       return v;
   }
   
     public static Vector searchPatientByDue()throws Exception{
        String query = "SELECT * FROM patients WHERE dues>0";
        System.out.println(query);
        Vector v = new Vector();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                PatientBean bean = new PatientBean();
           bean.setPatientId(rs.getString("pat_id"));
           bean.setPatientFirstName(rs.getString("pat_first_name"));
           bean.setPatientLastName(rs.getString("pat_last_name"));
           bean.setDues(rs.getInt("dues"));
                v.addElement(bean);
            }
        rs.close();
        st.close();
        return v;
    }
     
     public static Vector searchReceiptByDue()throws Exception{
        String query = "SELECT * FROM recipts WHERE dues>0 ORDER BY recipt_id";
        System.out.println(query);
        Vector v = new Vector();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                ReciptsBean bean = new ReciptsBean();
           bean.setReciptId(rs.getInt("recipt_id"));
           bean.setPatId(rs.getString("pat_id"));
           bean.setExpectedDate(rs.getDate("expected_date"));
           bean.setDues(rs.getInt("dues"));
                v.addElement(bean);
            }
        rs.close();
        st.close();
        return v;
    }

  public static PatientBean searchPatientById(String patId)throws  Exception{
 String query = "SELECT * FROM patients WHERE pat_id ='"+patId+"'";
      System.out.println(query);
      PatientBean bean = null;
      Statement st = connection.createStatement(); 
      ResultSet result = st.executeQuery(query);
      if(result.next()){
       bean = new PatientBean();
           bean.setPatientId(result.getString("pat_id"));
           bean.setPatientFirstName(result.getString("pat_first_name"));
           bean.setPatientLastName(result.getString("pat_last_name"));
           bean.setAge(result.getInt("pat_age"));
           bean.setGender(result.getInt("pat_gender"));
           bean.setContact(result.getString("pat_contact"));
           bean.setDues(result.getInt("dues"));
           bean.setRemarks(result.getString("remarks"));
       }
       result.close();
       st.close();
       return bean;
    }
  
  public static PatientBean searchPatientByContact(String contact)throws  Exception{
 String query = "SELECT * FROM patients WHERE pat_contact='"+contact+"'";
      System.out.println(query);
      PatientBean bean = null;
      Statement st = connection.createStatement();
      ResultSet result = st.executeQuery(query);
      if(result.next()){
       bean = new PatientBean();
           bean.setPatientId(result.getString("pat_id"));
           bean.setPatientFirstName(result.getString("pat_first_name"));
           bean.setPatientLastName(result.getString("pat_last_name"));
           bean.setAge(result.getInt("pat_age"));
           bean.setGender(result.getInt("pat_gender"));
           bean.setContact(result.getString("pat_contact"));
           bean.setDues(result.getInt("dues"));
           bean.setRemarks(result.getString("remarks"));
       }
       result.close();
       st.close();
       return bean;
    }
 
   public static Vector searchPatientByName(String name)throws Exception{
        String query = "SELECT * FROM patients WHERE UPPER(pat_first_name || ' ' || pat_last_name) like'"+name+"%'";
        System.out.println(query);
        Vector v = new Vector();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                PatientBean bean = new PatientBean();
                bean.setPatientId(rs.getString("pat_id"));
                bean.setPatientFirstName(rs.getString("pat_first_name"));
                bean.setPatientLastName(rs.getString("pat_last_name"));
                bean.setAge(rs.getInt("pat_age"));
                bean.setGender(rs.getInt("pat_gender"));
                bean.setContact(rs.getString("pat_contact"));
                bean.setDues(rs.getInt("dues"));
                bean.setRemarks(rs.getString("remarks"));
                v.addElement(bean);
            }
        rs.close();
        st.close();
        return v;
    }
//----------------Queries of recipts table----------------
public static Vector getAllRecipts()throws  Exception{   
 String query = "SELECT * FROM recipts";
      System.out.println(query);
      Vector vec = new Vector();
      Statement st = connection.createStatement();
      ResultSet result = st.executeQuery(query);
      while(result.next()){
       ReciptsBean rec = new ReciptsBean();
           rec.setReciptId(result.getInt("recipt_id"));
           rec.setManualRecId(result.getInt("manual_receipt_id"));
           System.out.println("Getting From server " + result.getInt("manual_receipt_id") );
           rec.setPatId(result.getString("pat_id"));
           rec.setDoctorId(result.getString("doctor_id"));
           rec.setDayId(result.getInt("day_id"));
           rec.setExpectedDate(result.getDate("expected_date"));
           rec.setDues(result.getInt("dues"));
           rec.setDiscounts(result.getInt("discounts"));
           rec.setTotal(result.getInt("total"));
       vec.addElement(rec);
      }//end of while
     result.close();
     st.close(); 
     return vec;
   }


public static int addRecipts(int reciptId, int manualRecId, String patId, String doctorId, int dayId, String expectedDate, int dues, int discounts, int total)throws  Exception{
   String query = "INSERT INTO recipts(recipt_id, manual_receipt_id, pat_id, doctor_id, day_id, expected_date, dues, discounts, total) VALUES ("+reciptId+", "+manualRecId+", '"+patId+"', '"+doctorId+"', "+dayId+", '"+expectedDate+"', "+dues+", "+discounts+", "+total+")";
      System.out.println(query);
      java.sql.Statement st = connection.createStatement();
      int r = st.executeUpdate(query);
      st.close();
      return r;
}

public static int deleteTestAtReceipt(int receiptId)throws  Exception{
   String query = "DELETE FROM test_at_recipt WHERE recipt_id="+receiptId;
      System.out.println(query);
      Statement st = connection.createStatement();
      int r = st.executeUpdate(query);
      st.close();
      return r;
}

public static int deleteReceipt(int receiptId)throws  Exception{
   String query = "DELETE FROM recipts WHERE recipt_id="+receiptId;
      System.out.println(query);
      Statement st = connection.createStatement();
      int r = st.executeUpdate(query);
      st.close();
      return r;
}

public static int getMaxReceiptId()throws Exception{
    String query = "SELECT MAX(recipt_id) AS id FROM recipts";
        System.out.println(query);
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        int id = 1;
        if(rs.next())
            id = rs.getInt("id");
        rs.close();
        st.close();
        return id;
}

public static ReciptsBean getReceiptAtId(int receiptId)throws Exception{
    String query = "SELECT * FROM recipts WHERE recipt_id="+receiptId;
    System.out.println(query);
    ReciptsBean bean = null;
      Statement st = connection.createStatement();
      ResultSet result = st.executeQuery(query);
      if(result.next()){
       bean= new ReciptsBean();
           bean.setReciptId(result.getInt("recipt_id"));
           bean.setManualRecId(result.getInt("manual_receipt_id"));
           bean.setPatId(result.getString("pat_id"));
           bean.setDoctorId(result.getString("doctor_id"));
           bean.setDayId(result.getInt("day_id"));
           bean.setExpectedDate(result.getDate("expected_date"));
           bean.setDues(result.getInt("dues"));
           bean.setDiscounts(result.getInt("discounts"));
           bean.setTotal(result.getInt("total"));
      }//end of while
      result.close();
     st.close();

     return bean;
}

public static boolean receiptExists(int receiptId)throws Exception{
    String query = "SELECT * FROM recipts WHERE recipt_id="+receiptId;
    System.out.println(query);
      Statement st = connection.createStatement();
      ResultSet result = st.executeQuery(query);
      boolean b = result.next();
      result.close();
     st.close();

     return b;
}

//----------------Queries of report_details table----------------
public static Vector getAllReportDetails(int testAtReportId)throws  Exception{   
 String query = "SELECT * FROM report_details WHERE test_at_report_id="+testAtReportId+" ORDER BY report_detail_id ASC";
      System.out.println(query);
      Vector vec = new Vector();
      Statement st = connection.createStatement();
      ResultSet result = st.executeQuery(query);
      while(result.next()){
       ReportDetailsBean rec = new ReportDetailsBean();
           rec.setReportDetailId(result.getInt("report_detail_id"));
           rec.setTestAtReportId(result.getInt("test_at_report_id"));
           rec.setTestParamId(result.getInt("test_param_id"));
           rec.setTestResult(result.getString("test_result"));
           rec.setManualHeading(result.getString("manual_heading"));
       vec.addElement(rec);
      }//end of while
      result.close();
      st.close();

     return vec;

   }

public static int deleteReportDetails(int test_at_report_id)throws  Exception{
   String query = "DELETE FROM report_details WHERE test_at_report_id="+test_at_report_id;
      System.out.println(query);
      Statement st = connection.createStatement();
      int r = st.executeUpdate(query);
      st.close();
      return r;
}

public static void addReportDetails(int reportDetailId, int testAtReportId, int testParamId, String testResult, String manualHeading)throws  Exception{
   String query = "INSERT INTO report_details(report_detail_id, test_at_report_id, test_param_id, test_result, manual_heading) VALUES ("+reportDetailId+", "+testAtReportId+", "+testParamId+", '"+testResult+"', '"+manualHeading+"')";
      System.out.println(query);
      java.sql.Statement st = connection.createStatement();
      st.executeUpdate(query);
      st.close();
}


public static int getMaxReportDetailId()throws Exception{
        String query = "SELECT MAX(report_detail_id) AS id FROM report_details";
        System.out.println(query);
        java.sql.Statement st = connection.createStatement();
        java.sql.ResultSet rs = st.executeQuery(query);
        int id = 1;
        if(rs.next())
            id = rs.getInt("id");
        rs.close();
        st.close();
        return id;
}

public static int deleteTestAtReport(int receiptId)throws  Exception{
   String query = "DELETE FROM tests_at_reports WHERE report_id="+receiptId;
      System.out.println(query);
      Statement st = connection.createStatement();
      int r = st.executeUpdate(query);
      st.close();
      return r;
}

public static int deleteReport(int receiptId)throws  Exception{
   String query = "DELETE FROM reports WHERE report_id="+receiptId;
      System.out.println(query);
      Statement st = connection.createStatement();
      int r = st.executeUpdate(query);
      st.close();
      return r;
}

//----------------Queries of reports table----------------

public static ReportsBean getReportAtReceipt(int receiptId)throws  Exception{

 String query = "SELECT * FROM reports WHERE recipt_id="+receiptId;
      System.out.println(query);
      ReportsBean rec = null;
      Statement st = connection.createStatement();
      ResultSet result = st.executeQuery(query);
      while(result.next()){
           rec = new ReportsBean();
           rec.setReportId(result.getInt("report_id"));
           rec.setReciptId(result.getInt("recipt_id"));
           rec.setDay(result.getDate("day"));
           rec.setLabNo(result.getString("lab_no"));
           rec.setSpecimen(result.getString("specimen"));
           rec.setGenerated(result.getInt("generated"));
      }//end of while

     result.close();
     st.close();
     
     return rec;

   }

public static int addReports(int reportId, int reciptId, String day, String labNo, String specimen, int generated)throws  Exception{
   String query = "INSERT INTO reports(report_id, recipt_id, day, lab_no, specimen, generated) VALUES ("+reportId+", "+reciptId+", '"+day+"', '"+labNo+"', '"+specimen+"', "+generated+")";
      System.out.println(query);
      Statement st = connection.createStatement();
      int r = st.executeUpdate(query);
      st.close();
      return r;
}


public static int updateReports(int reportId, int reciptId, String day, String labNo, String specimen, int generated)throws  Exception{     
   String query = "UPDATE reports SET recipt_id="+reciptId+", day='"+day+"', lab_no='"+labNo+"', specimen='"+specimen+"', generated="+generated+"  WHERE report_id="+reportId;
      System.out.println(query);
      Statement st = connection.createStatement();
      int r = st.executeUpdate(query);
      st.close();
      return r;
}


public static Vector getAllUngeneratedReports()throws Exception{
    String query = "SELECT * FROM reports WHERE generated="+Constants.NOTGENERATED;
    System.out.println(query);
    Vector vec = new Vector();
      Statement st = connection.createStatement();
      ResultSet result = st.executeQuery(query);
      while(result.next()){
       ReportsBean rec = new ReportsBean();
           rec.setReportId(result.getInt("report_id"));
           rec.setReciptId(result.getInt("recipt_id"));
           rec.setDay(result.getDate("day"));
           rec.setLabNo(result.getString("lab_no"));
           rec.setSpecimen(result.getString("specimen"));
           rec.setGenerated(result.getInt("generated"));
       vec.addElement(rec);
      }//end of while
     result.close();
     st.close();
     return vec;
}

public static Vector getUngeneratedReports(int categoryId)throws Exception{
    String query = "select distinct r.report_id, r.recipt_id, r.day, r.lab_no, r.specimen, r.generated from reports r, tests_at_reports tar, tests t where r.generated = "+Constants.NOTGENERATED+" AND r.report_id = tar.report_id AND tar.test_id = t.test_id AND t.test_category_id = " + categoryId;
    System.out.println(query);
    Vector vec = new Vector();
      Statement st = connection.createStatement();
      ResultSet result = st.executeQuery(query);
      while(result.next()){
       ReportsBean rec = new ReportsBean();
           rec.setReportId(result.getInt("report_id"));
           rec.setReciptId(result.getInt("recipt_id"));
           rec.setDay(result.getDate("day"));
           rec.setLabNo(result.getString("lab_no"));
           rec.setSpecimen(result.getString("specimen"));
           rec.setGenerated(result.getInt("generated"));
       vec.addElement(rec);
      }//end of while
     result.close();
     st.close();
     return vec;
}

// -------------- Queries of tests_at_reports table -------------
public static Vector<TestsAtReportsBean> getAllTestsAtReports(int reportId)throws Exception{
    String query = "SELECT * from tests_at_reports WHERE report_id="+reportId;
    System.out.println(query);
    Vector v = new Vector();
    Statement st = connection.createStatement();
    ResultSet rs = st.executeQuery(query);
    while(rs.next()){
        TestsAtReportsBean bean = new TestsAtReportsBean();
        bean.setTestAtReportId(rs.getInt("test_at_report_id"));
        bean.setReportId(rs.getInt("report_id"));
        bean.setTestId(rs.getInt("test_id"));
        bean.setGenerated(rs.getInt("generated"));
        v.addElement(bean);
    }
    rs.close();
    st.close();
    return v;
}

public static Vector getTestsAtReportIds(int reportId)throws Exception{
    String query = "SELECT test_at_report_id from tests_at_reports WHERE report_id="+reportId;
    System.out.println(query);
    Vector v = new Vector();
    Statement st = connection.createStatement();
    ResultSet rs = st.executeQuery(query);
    while(rs.next()){
        v.addElement(rs.getInt("test_at_report_id"));
    }
    rs.close();
    st.close();
    return v;
}

public static int getMaxTestAtReportId()throws Exception{
    String query = "SELECT MAX(test_at_report_id) AS id FROM tests_at_reports";
        System.out.println(query);
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        int id = 1;
        if(rs.next())
            id = rs.getInt("id");
        rs.close();
        st.close();
        return id;
}

public static int addTestAtReport(int testAtReportId, int reportId, int testId, int generated)throws  Exception{
   String query = "INSERT INTO tests_at_reports(test_at_report_id, report_id, test_id, generated) VALUES("+testAtReportId+", "+reportId+", "+testId+", "+generated+")";
   System.out.println(query);
   Statement st = connection.createStatement();
   int r = st.executeUpdate(query);
   st.close();
   return r;
}

public static int updateTestAtReport(int testAtReportId, int generated)throws  Exception{
   String query = "UPDATE tests_at_reports SET generated="+generated+" WHERE test_at_report_id="+testAtReportId;
   System.out.println(query);
   Statement st = connection.createStatement();
   int r = st.executeUpdate(query);
   st.close();
   return r;
}

//----------------Queries of test_at_recipt table----------------
public static Vector getAllTestAtRecipt(int reciptId)throws  Exception{
 String query = "SELECT * FROM test_at_recipt WHERE recipt_id="+reciptId;
      System.out.println(query);
      Vector vec = new Vector();
      Statement st = connection.createStatement();
      ResultSet result = st.executeQuery(query);
      while(result.next()){
       TestAtReciptBean rec = new TestAtReciptBean();
           rec.setTestAtReciptId(result.getInt("test_at_recipt_id"));
           rec.setReciptId(result.getInt("recipt_id"));
           rec.setTestId(result.getInt("test_id"));
           rec.setCharges(result.getInt("charges"));
       vec.addElement(rec);
      }//end of while
     result.close();
     st.close();
     return vec;
   }

public static int addTestAtRecipt(int testAtReciptId, int reciptId, int testId, int charges)throws  Exception{
   String query = "INSERT INTO test_at_recipt(test_at_recipt_id, recipt_id, test_id, charges) VALUES ("+testAtReciptId+", "+reciptId+", "+testId+", "+charges+")";
      System.out.println(query);
      Statement st = connection.createStatement();
      int r = st.executeUpdate(query);
      st.close();
      return r;
}


public static int getMaxTestAtReciptId()throws Exception{
    String query = "SELECT MAX(test_at_recipt_id) AS id FROM test_at_recipt";
        System.out.println(query);
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        int id = 1;
        if(rs.next())
            id = rs.getInt("id");
        rs.close();
        st.close();
        return id;
}

//----------------Queries of test_categories table----------------
public static Vector getAllTestCategories()throws  Exception{
String query = "SELECT * FROM test_categories ORDER BY test_category_name ASC";
      System.out.println(query);
      Vector vec = new Vector();
      Statement st = connection.createStatement();
      ResultSet result = st.executeQuery(query);
      while(result.next()){
       TestCategoriesBean rec = new TestCategoriesBean();
           rec.setTestCategoryId(result.getInt("test_category_id"));
           rec.setTestCategoryName(result.getString("test_category_name"));
           rec.setRemarks(result.getString("remarks"));
       vec.addElement(rec);
      }//end of while
      result.close();
      st.close();
     return vec;

   }

public static int addTestCategories(int testCategoryId, String testCategoryName, String remarks)throws  Exception{
   String query = "INSERT INTO test_categories(test_category_id,test_category_name, remarks) VALUES ("+testCategoryId+", '"+testCategoryName+"', '"+remarks+"')";
      System.out.println(query);
      Statement st = connection.createStatement();
      int r = st.executeUpdate(query);
      st.close();
      return r;
}

public static int updateTestCategories(int testCategoryId, String testCategoryName, String remarks)throws  Exception{     
   String query = "UPDATE test_categories SET test_category_name='"+testCategoryName+"', remarks='"+remarks+"' WHERE test_category_id="+testCategoryId;
      System.out.println(query);
      Statement st = connection.createStatement();
      int r = st.executeUpdate(query);
      st.close();
      return r;
}


public static int deleteTestCategories(int testCategoryId)throws  Exception{
   String query = "DELETE FROM test_categories WHERE test_category_id="+testCategoryId;
      System.out.println(query);
      Statement st = connection.createStatement();
      int r = st.executeUpdate(query);
      st.close();
      return r;
}

public static int getMaxTestCategoryId()throws Exception{
    String query = "SELECT MAX(test_category_id) AS id FROM test_categories";
    System.out.println(query);
    Statement st = connection.createStatement();
    ResultSet rs = st.executeQuery(query);
    int id = 1;
    if(rs.next())
        id = rs.getInt("id");
    rs.close();
    st.close();
    return id;
}

//----------------Queries of tests table----------------
public static Vector getAllTests(int testCategoryId)throws  Exception{
 String query = "SELECT * FROM tests WHERE test_category_id="+testCategoryId+" ORDER BY test_name ASC";
      System.out.println(query);
      Vector vec = new Vector();
      Statement st = connection.createStatement();
      ResultSet result = st.executeQuery(query);
      while(result.next()){
       TestsBean rec = new TestsBean();
           rec.setTestId(result.getInt("test_id"));
           rec.setTestCategoryId(result.getInt("test_category_id"));
           rec.setTestName(result.getString("test_name"));
           rec.setTestCharges(result.getInt("test_charges"));
           rec.setRemarks(result.getString("remarks"));
       vec.addElement(rec);
      }//end of while
      result.close();
     st.close();

     return vec;
   }

public static int addTests(int testId, int testCategoryId, String testName, int testCharges, String remarks)throws  Exception{
   String query = "INSERT INTO tests(test_id, test_category_id, test_name, test_charges, remarks) VALUES ("+testId+", "+testCategoryId+", '"+testName+"', "+testCharges+", '"+remarks+"')";
      System.out.println(query);
      Statement st = connection.createStatement();
      int r = st.executeUpdate(query);
      st.close();
      return r;
}

public static int updateTests(int testId, int testCategoryId, String testName, int testCharges, String remarks)throws  Exception{
      String query = "UPDATE tests SET test_category_id="+testCategoryId+", test_name='"+testName+"', test_charges="+testCharges+", remarks='"+remarks+"' WHERE test_id="+testId;
      System.out.println(query);
      Statement st = connection.createStatement();
      int r = st.executeUpdate(query);
      st.close();
      return r;
}


public static int deleteTests(int testId)throws  Exception{
      String query = "DELETE FROM tests_params WHERE test_id="+testId;
      System.out.println(query);
      Statement st = connection.createStatement();
      int r = st.executeUpdate(query);
      if(r>0){
            query = "DELETE FROM tests WHERE test_id="+testId;
            System.out.println(query);
            r = st.executeUpdate(query);
      }
      st.close();
      return r;
}

public static int getMaxTestId()throws Exception{
    String query = "SELECT MAX(test_id) AS id FROM tests";
    System.out.println(query);
    Statement st = connection.createStatement();
    ResultSet rs = st.executeQuery(query);
    int id = 1;
    if(rs.next())
        id = rs.getInt("id");
    rs.close();
    st.close();
    return id;
}

public static TestsBean getTestAtId(int testId)throws Exception{
    String query = "SELECT * FROM tests WHERE test_id="+testId;
      System.out.println(query);
      TestsBean bean = null;
      Statement st = connection.createStatement();
      ResultSet result = st.executeQuery(query);
      if(result.next()){
       bean = new TestsBean();
           bean.setTestId(result.getInt("test_id"));
           bean.setTestCategoryId(result.getInt("test_category_id"));
           bean.setTestName(result.getString("test_name"));
           bean.setTestCharges(result.getInt("test_charges"));
           bean.setRemarks(result.getString("remarks"));
      }//end of while
      result.close();
     st.close();

     return bean;
}


  
  public static int getTotalTestsDatewise(int testId, String fromDate, String toDate)throws Exception{
        String query = "select * from test_at_recipt where recipt_id IN (select recipt_id from recipts where day_id IN (select day_id from days where day BETWEEN '"+fromDate+"' AND '"+toDate+"')) AND test_id ="+testId;
        System.out.println(query);
        int count = 0;
        Statement st = connection.createStatement(); 
        ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                count++;
            }
        rs.close();
        st.close();
        return count;
    }
//----------------Queries of tests_params table----------------
public static Vector getAllTestsParams(int testId)throws  Exception{
 String query = "SELECT * FROM tests_params WHERE test_id="+testId+" ORDER BY test_params_id";
      System.out.println(query);
      Vector vec = new java.util.Vector();
      Statement st = connection.createStatement();
      ResultSet result = st.executeQuery(query);
      while(result.next()){
       TestsParamsBean rec = new TestsParamsBean();
           rec.setTestParamsId(result.getInt("test_params_id"));
           rec.setTestId(result.getInt("test_id"));
           rec.setTestParamsName(result.getString("test_params_name"));
           rec.setTestParamsRange(result.getString("test_params_range"));
       vec.addElement(rec);
      }//end of while
      result.close();
     st.close();

     return vec;

   }

public static int addTestsParams(int testParamId, int testId, String testParamsName, String testParamsRange)throws  Exception{   
   String query = "INSERT INTO tests_params(test_params_id, test_id, test_params_name, test_params_range) VALUES("+testParamId+", "+testId+", '"+testParamsName+"', '"+testParamsRange+"')";
      System.out.println(query);
      Statement st = connection.createStatement();
      int r = st.executeUpdate(query);
      st.close();
      return r;
}

public static int getMaxTextParamId()throws Exception{
    String query = "SELECT MAX(test_params_id) AS id FROM tests_params";
    System.out.println(query);
    Statement st = connection.createStatement();
    ResultSet rs = st.executeQuery(query);
    int id = 1;
    if(rs.next())
        id = rs.getInt("id");
    rs.close();
    st.close();
    return id;
}

public static TestsParamsBean getTestParamAtId(int testParamId)throws Exception{
    String query = "SELECT * FROM tests_params WHERE test_params_id="+testParamId;
      System.out.println(query);
      Statement st = connection.createStatement();
      ResultSet result = st.executeQuery(query);
      TestsParamsBean bean = null;
      if(result.next()){
       bean = new TestsParamsBean();
           bean.setTestParamsId(result.getInt("test_params_id"));
           bean.setTestId(result.getInt("test_id"));
           bean.setTestParamsName(result.getString("test_params_name"));
           bean.setTestParamsRange(result.getString("test_params_range"));
      }//end of while
      result.close();
     st.close();

     return bean;
}


// --------------- queries of users table -------- //
public static Vector getAllUsers()throws Exception{
    String query = "SELECT * FROM users";
    System.out.println(query);
    Vector v = new Vector();
    Statement st = connection.createStatement();
    ResultSet rs = st.executeQuery(query);
    while(rs.next()){
        UsersBean bean = new UsersBean();
        bean.setUserId(rs.getInt("user_id"));
        bean.setUserName(rs.getString("user_name"));
        bean.setUserPassword(rs.getString("user_password"));
        v.addElement(bean);
    }
    rs.close();
    st.close();
    return v;
}

public static boolean login(int typeId, String userName, String password)throws Exception{
    String query = "SELECT user_id FROM users WHERE user_name='"+userName+"' AND user_password='"+password+"' AND type_id="+typeId;
    System.out.println(query);
    Statement st = connection.createStatement();
    ResultSet rs = st.executeQuery(query);
    boolean b = rs.next();
    
    rs.close();
    st.close();
    return b;
}

public static boolean loginUser(int typeId, String userName, String password)throws Exception{
    String query = "SELECT user_id FROM users WHERE user_name='"+userName+"' AND user_password='"+password+"' AND type_id="+typeId;
    System.out.println(query);
    Statement st = connection.createStatement();
    ResultSet rs = st.executeQuery(query);
    boolean b = rs.next();
    if(b){
        Statement st2 = connection.createStatement();
        query = "UPDATE users SET active=0 WHERE type_id="+typeId;
        System.out.println(query);
        st2.executeUpdate(query);
        query = "UPDATE users SET active=1 WHERE user_id="+rs.getInt("user_id");
        System.out.println(query);
        st2.executeUpdate(query);
        
        st2.close();
    }
    rs.close();
    st.close();
    return b;
}
 
  public static int updatePassword(String userName, String userPassword)throws Exception{
        String query = "UPDATE users SET user_password='"+userPassword+"' WHERE user_name='"+userName+"'";
        System.out.println(query);
        int r = 0;
        Statement st = connection.createStatement();
        r = st.executeUpdate(query);
        st.close();
        return r;
    }
  
  public static String getCurrentUser()throws Exception{
      String query = "SELECT user_name FROM users WHERE active=1 AND type_id=2";
      System.out.println(query);
      Statement st = connection.createStatement();
      ResultSet rs = st.executeQuery(query);
      String username="";
      if(rs.next())
          username = rs.getString("user_name");
      st.close();
      rs.close();
      return username;
  }
  
  // ========== queries of type table ========= //
  public static Vector getAllTypes()throws Exception{
    String query = "SELECT * FROM type";
    System.out.println(query);
    Vector v = new Vector();
    Statement st = connection.createStatement();
    ResultSet rs = st.executeQuery(query);
    while(rs.next()){
        TypeBean bean = new TypeBean();
        bean.setTypeId(rs.getInt("type_id"));
        bean.setTypeName(rs.getString("type_name"));
        v.addElement(bean);
    }
    rs.close();
    st.close();
    return v;
}



  public static Vector getAllUsers(int typeId)throws Exception{
    String query = "SELECT * FROM users WHERE type_id="+typeId;
    System.out.println(query);
    Vector v = new Vector();
    Statement st = connection.createStatement();
    ResultSet rs = st.executeQuery(query);
    while(rs.next()){
        UsersBean bean = new UsersBean();
        bean.setUserId(rs.getInt("user_id"));
        bean.setUserName(rs.getString("user_name"));
        bean.setUserPassword(rs.getString("user_password"));
        bean.setActive(rs.getInt("active"));
        bean.setTypeId(rs.getInt("type_id"));
        v.addElement(bean);
    }
    rs.close();
    st.close();
    return v;
}

  public static int insertUser(int userId,String username, String password,int typeId, int active)throws  Exception{
   String query = "insert into users(user_id, user_name, user_password, type_id, active) values('"+userId+"','"+username+"','"+password+"',"+typeId+","+active+")";
      System.out.println(query);
      Statement st = connection.createStatement();
      int r = st.executeUpdate(query);
      st.close();
      return r;
}

public static int updateUser(int userId,String username, String password,int typeId, int active)throws  Exception{
      String query = "UPDATE users SET type_id="+typeId+", user_name='"+username+"', user_password='"+password+"' WHERE user_id="+userId;
      System.out.println(query);
      Statement st = connection.createStatement();
      int r = st.executeUpdate(query);
      st.close();
      return r;
}


  public static int deleteUser(int userId)throws Exception{
        String query = "DELETE FROM users WHERE user_id='"+userId+"'";
        System.out.println(query);
        int r=0;
        Statement st = connection.createStatement();
        r = st.executeUpdate(query);
        st.close();
        return r;
    }

public static int getMaxUserId()throws Exception{
    String query = "SELECT MAX(user_id) AS id FROM users";
    System.out.println(query);
    Statement st = connection.createStatement();
    ResultSet rs = st.executeQuery(query);
    int id = 1;
    if(rs.next())
        id = rs.getInt("id");
    rs.close();
    st.close();
    return id;
}

 public static Vector getSummary(String date)throws Exception{
      String query = "SELECT * FROM recipts WHERE day_id in (SELECT day_id FROM days WHERE day='"+date+"') ORDER BY recipt_id ASC";
      System.out.println(query);
       Vector v = new Vector();
       Statement st =connection.createStatement();
       ResultSet result = st.executeQuery(query);
       while(result.next()){
           ReciptsBean bean = new ReciptsBean();
           bean.setReciptId(result.getInt("recipt_id"));
           bean.setManualRecId(result.getInt("manual_receipt_id"));
           bean.setPatId(result.getString("pat_id"));
           bean.setDues(result.getInt("dues"));
           bean.setDiscounts(result.getInt("discounts"));
           bean.setTotal(result.getInt("total"));
           v.addElement(bean);
       }
       result.close();
       st.close();
       return v;
   }

 public static ReportDetailsBean getTestResults(int testParamId)throws Exception{
    String query = "SELECT * FROM report_details WHERE test_param_id="+testParamId;
      System.out.println(query);
      Statement st = connection.createStatement();
      ResultSet result = st.executeQuery(query);
      ReportDetailsBean bean = null;
      if(result.next()){
       bean = new ReportDetailsBean();
           bean.setTestResult(result.getString("test_result"));
      }//end of while
      result.close();
     st.close();

     return bean;
}

 public static void updateReportDetails(int reportDetailsId, String testResult)throws  Exception{
     String query = "UPDATE report_details SET test_result='"+testResult+"' WHERE report_detail_id="+reportDetailsId;
     System.out.println(query);
        Statement st = connection.createStatement();
        st.executeUpdate(query);
        st.close();
 }

public static void updateReportRemarks(int reportDetailsId, String manualHeading)throws  Exception{
     String query = "UPDATE report_details SET manual_heading='"+manualHeading+"' WHERE report_detail_id="+reportDetailsId;
     System.out.println(query);
        Statement st = connection.createStatement();
        st.executeUpdate(query);
        st.close();
 }


 public static TestsParamsBean TestParamsBean(int testParamId)throws Exception{
      String query = "SELECT * FROM tests_params WHERE test_params_id="+testParamId;
      System.out.println(query);
      Statement st = connection.createStatement();
      ResultSet result = st.executeQuery(query);
      TestsParamsBean bean = null;
      if(result.next()){
       bean = new TestsParamsBean();
       bean.setTestId(result.getInt("test_id"));
       bean.setTestParamsId(result.getInt("test_params_id"));
       bean.setTestParamsName(result.getString("test_params_name"));
       bean.setTestParamsRange(result.getString("test_params_range"));
      }//end of while
      result.close();
     st.close();

     return bean;
 }

 public static int updateTestParams(int testParamId, String testParamName, String testParamRange)throws  Exception{
      String query = "UPDATE tests_params SET test_params_name='"+testParamName+"', test_params_range='"+testParamRange+"' WHERE test_params_id="+testParamId;
      System.out.println(query);
      Statement st = connection.createStatement();
      int r = st.executeUpdate(query);
      st.close();
      return r;
}

 public static int deleteTestParam(int testParamId)throws  Exception{
      String query = "DELETE FROM tests_params WHERE test_params_id="+testParamId;
      System.out.println(query);
      Statement st = connection.createStatement();
      int r = st.executeUpdate(query);
      st.close();
      return r;
}

 public static boolean containReports(int test_param_id)throws Exception{
     String query = "SELECT * FROM report_details WHERE test_param_id="+test_param_id;
     System.out.println(query);
     Statement st = connection.createStatement();
     ResultSet rs = st.executeQuery(query);
     boolean b = rs.next();
     rs.close();
     st.close();
     return b;
 }
}
