package Day14;

import Day0.S;

import java.util.Scanner;

public class ConversionRomDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        StringBuilder sb = new StringBuilder();
        if(s.length() <= 9){
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                    sb.append(digitToRomNumeral(s.charAt(i)));
                }
            }
        }else{
            System.out.println("illegal string");
        }

        System.out.println(sb);
    }

    public static String digitToRomNumeral(char chr) {
        switch (chr) {
            case '0':
                return "";
            case '1':
                return "I";
            case '2':
                return "II";
            case '3':
                return "III";
            case '4':
                return "IV";
            case '5':
                return "V";
            case '6':
                return "VI";
            case '7':
                return "VII";
            case '8':
                return "VIII";
            case '9':
                return "IX";
            default:
                return "Invalid";
        }
    }

}
