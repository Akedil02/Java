package Day19;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UserRegistory {

    //Username
    public static final Set<String> usedUsernames = new HashSet<>();
    public static boolean isUserNameAvailable(String username){
        return !isUsernameTakenMethod(username) && isUsernameCharsLegalMethod(username);
    }

    public static boolean isUsernameTakenMethod(String username){
          return usedUsernames.contains(username);
    }
    public static boolean isUsernameCharsLegalMethod(String username){
        int len = username.length();
        if(len < 3 || len > 15){
            return false;
        }
        int letterCount = 0;
        int digitCount = 0;
        for (int i = 0; i < username.length(); i++) {
            if (username.charAt(i) >= 'a' && username.charAt(i) <= 'z' || username.charAt(i) >= 'A' && username.charAt(i) <= 'Z'){
                letterCount ++;
            } else if (username.charAt(i) >= '0' && username.charAt(i) <= '9') {
                digitCount ++;
            }else {
                return false;
            }
        }
        return letterCount != 0 && digitCount != 0;
    }

    //Password
    public static boolean isPasswordLegalMethod(String password1){
        return password1.length() >= 6;
    }

    //ID
    public static boolean isIDLegalMethod(String ID){
        if (ID.length() != 18) return false; // 一定要先判断长度

        if (ID.charAt(0) == '0') return false; // 首位不能为0


        for (int i = 0; i < 17; i++) { // 1-17 为数字
            if (!Character.isDigit(ID.charAt(i))) {
                return false;
            }
        }
        //18 为数或x X
        return ID.charAt(17) >= '0' && ID.charAt(17) <= '9' || ID.charAt(17) == 'X' || ID.charAt(17) == 'x' ;
    }

    //Phone number
    public static boolean isPhoneNumberLegalMethod(String pn){
        if(pn.length() != 11) return false;

        for (int i = 1; i < pn.length(); i++) {
            if(pn.charAt(i) <= '0' && pn.charAt(i) >= '9'){
                return false;
            }
        }
        return pn.charAt(0) != '0';
    }
}
