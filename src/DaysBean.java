/*
* DaysBean.java
*
* Created on 07-Feb-2013 09:10:39 PM
*
*
* @author SAND Tech Solutions
*/

public class DaysBean{
    private int dayId;
    private java.util.Date day;
    private int dues;
    private int discount;
    private int balance;
    private int closed;
    private String remarks;

    /*Constructor*/
    public DaysBean() {}

    /*Setter Methods*/
    public void setDayId(int dayId){
        this.dayId = dayId;
    }
    public void setDay(java.util.Date day){
        this.day = day;
    }
    public void setDues(int dues){
        this.dues = dues;
    }
    public void setDiscount(int discount){
        this.discount = discount;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public void setClosed(int closed){
        this.closed = closed;
    }
    public void setRemarks(String remarks){
        this.remarks = remarks;
    }

    /*Getter Methods*/
    public int getDayId(){
        return this.dayId;
    }
    public java.util.Date getDay(){
        return this.day;
    }
    public int getDues(){
        return this.dues;
    }
    public int getDiscount(){
        return this.discount;
    }
    public int getBalance(){
        return this.balance;
    }
    public int getClosed(){
        return this.closed;
    }
    public String getRemarks(){
        return this.remarks;
    }

    @Override
    public String toString(){
        return DateFormatter.dateToString(day);
    }
}
