package Day15;

import java.util.Scanner;

public class ConversionToRom2Way {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




        while (true){
            System.out.println("Inter a string: ");
            String str = sc.next();
            boolean flag = checkIfValid(str);
            if(flag){
                System.out.println(DigitToRom(str));
                break;
            }else {
                System.out.println("Invalid value");
                continue;
            }
        }

    }

    public static String DigitToRom(String s){
        String[] srr = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(srr[s.charAt(i)-'0']);
        }
        return sb.toString();
    }


    public static boolean checkIfValid(String str){
        if(str.length()<= 9){
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                    continue;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
