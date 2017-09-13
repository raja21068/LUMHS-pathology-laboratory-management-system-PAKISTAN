/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jay & Raja
 */

public class PatientBean {
    private String patientId;
    private String patientFirstName;
    private String patientLastName;
    private int age;
    private int gender;
    private String contact;
    private int dues;
    private String remarks;
    
    public String getPatientId(){
        return patientId;
    }
    public String getPatientFirstName(){
        return patientFirstName;
    }
    public String getPatientLastName(){
        return patientLastName;
    }
    public int getAge(){
        return age;
    }
    public int getGender(){
        return gender;
    }
    public String getContact(){
        return contact;
    }
    public int getDues(){
        return dues;
    }
    public String getRemarks(){
        return remarks;
    }
    
    
    public void setPatientId(String patId){
        patientId = patId;
    }
    public void setPatientFirstName(String patFName){
        patientFirstName = patFName;
    }
    public void setPatientLastName(String patLName){
        patientLastName = patLName;
    }
    public void setAge(int ag){
        age = ag;
    }
    public void setGender(int gen){
        gender = gen;
    }
    public void setContact(String con){
         contact = con;
    }
    public void setDues(int due){
         dues = due;
    }
    public void setRemarks(String Rem){
        remarks = Rem;
    }
    
     public String toString(){
         return patientFirstName + " " + patientLastName;
     } 
}
