package Day16;

public class ProductOfStrings {
    public static void main(String[] args) {
        String s1 = "214748364";
        String s2 = "2147483649";

        int a = StrToInt(s1);
        int b = StrToInt(s2);
        int c = 0;

        System.out.println(a);
        System.out.println(b);

        if(a != 0 && b != 0 && (a > Integer.MAX_VALUE / b || b > Integer.MAX_VALUE / a)){
            c = Integer.MAX_VALUE;
        }else {
            c = a * b;
        }
        System.out.println(c);
    }

    public static int StrToInt(String s){
        int result = 0;
        int i = 0;
        int n = s.length();

        while (i < n && s.charAt(i) == ' ') i++;
        if (i == n) return 0;

        boolean MinusSign = false;


        while (i < n ) {
            if ( Character.isDigit(s.charAt(i))){int digit = s.charAt(i) - '0';
                // 4. 检查是否溢出
                if (result > (Integer.MAX_VALUE- digit)/10 ) {
                    return MinusSign ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }

                result = result * 10 + digit;
                i++;
            } else if(s.charAt(i) == '+' || s.charAt(i) == '-'){
                MinusSign = s.charAt(i) == '-' ;
                i ++;
            }else {
                i++;
            }


        }

        int minusInt = MinusSign ? -1 :  1;
        return result * minusInt;


    }
}
