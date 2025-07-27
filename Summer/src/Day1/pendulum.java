package Day1;

import java.util.Scanner;

public class pendulum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();


        Boolean pend = true;

        for(int i = 0; i <= str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                pend = false;
                break;
            }
        }

        if(pend){
            System.out.println("This is a Day1.pendulum");
        }
        else{
            System.out.println("This is not a Day1.pendulum");
        }
    }
}
