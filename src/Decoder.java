/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jay & Raja
 */

public class Decoder {
    
   public static String genderDecode(int i){
        if(i == Constants.MALE){
            return "Male";
        }
        if(i == Constants.FEMALE){
            return "Female";
        }
        return null;
    }
   
   public static String statusDecode(int i){
       if(i== Constants.GENERATED)
           return "Generated";
       if(i== Constants.NOTGENERATED)
           return "Not Generated";
       
       return null;
   }
    
}
