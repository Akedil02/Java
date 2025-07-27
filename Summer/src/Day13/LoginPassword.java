package Day13;

import java.util.Scanner;

public class LoginPassword {

    public static void main(String[] args) {
        String login = "Akedilo";
        String password = "1234";

        Scanner sc = new Scanner(System.in);

        int chance = 3;
        while(chance > 0){
            System.out.println("Inter the login and password:(separated with Inter)");
            String loginInput = sc.next();
            String passwordInput = sc.next();

            if(loginInput.equals(login) && passwordInput.equals(password)){
                System.out.println("Login successfully");
                break;
            }else {
                chance--;
                System.out.println("Wrong login or password, try again, you have " + chance + " times left.");
            }
        }

    }

}
