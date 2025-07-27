package Day13;

import java.util.Scanner;

public class AmountConversion {
    private static String unit = "佰拾万千佰拾元";


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inter the total amount: ");
        String amount = sc.next();
        int zeroCounts = 7-amount.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < zeroCounts; i++) {
            sb.append("0");
        }
        sb.append(amount);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            result.append(toChineseDigit(sb.charAt(i)));
            result.append(unit.charAt(i));
        }

        System.out.println(result);
    }


    public static String toChineseDigit(char digit) {
        switch (digit) {
            case '0': return "零";
            case '1': return "壹";
            case '2': return "贰";
            case '3': return "叁";
            case '4': return "肆";
            case '5': return "伍";
            case '6': return "陆";
            case '7': return "柒";
            case '8': return "捌";
            case '9': return "玖";
            default: return "";
        }
    }
}
