/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jay & Raja
 */

public class Encoder {
    public static int genderEncode(String s){
        if(s.equals("Male")){
            return Constants.MALE;
        }
        if(s.equals("Female")){
            return Constants.FEMALE;
        }
                
        return -1;
    }

}
