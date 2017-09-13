/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jay & Raja
 */

public class DoctorBean{
    
        private String doctorId;
        private String doctorName;
        private String doctorContact;
        private String remarks;
        

    public String toString(){
        return doctorName;
    }

    void setDoctorId(String doctorId){
	this.doctorId = doctorId;
    }

    void setDoctorName(String doctorName){
	this.doctorName = doctorName;
    }

    void setDoctorContact(String doctorContact){
	this.doctorContact = doctorContact;
    }

    void setRemarks(String remarks){
	this.remarks = remarks;
    }



    String getDoctorId(){
	return doctorId;
    }

    String getDoctorName(){
	return doctorName;
    }

    String getDoctorContact(){
	return doctorContact;
    }

    String getRemarks(){
	return remarks;
    }

}
