
public class DateFormatter {
    public static String dateToString(java.util.Date d){
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MMM-yyyy");
        return sdf.format(d);
    }
    
    public static String dateToString2(java.util.Date d){
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(d);
    }
   
}
