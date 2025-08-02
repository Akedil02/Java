package Day19;

import java.util.Scanner;

public class VerifyPassword {



    public static void start(){

        User admin = new User("Akedil123","1","1","1");
        UserRegistory.usedUsernames.add("Akedil123");
        SignUpSystem.UserData.add(admin);

        Scanner sc = new Scanner(System.in);
        String username = "";
        String verifyID = "";
        String verifyPhoneNumber = "";


        System.out.println("****** Welcome to password reset page ******");
        outer:
        while (true){
            System.out.println("Enter username: ");
            username = sc.next();
            if (!UserRegistory.isUsernameTakenMethod(username)){
                System.out.println("User is not registered.");
                while (true){
                    System.out.println("Choose option number:  (1)Go register (2)Try again");
                    int option = sc.nextInt();
                    sc.nextLine();
                    if (option >= 1 && option <= 2) {
                        if (option == 1) {
                            SignUpSystem.start();
                            return;
                        }
                        continue outer;
                    } else {
                        System.out.println("Invalid option, choose again");
                    }
                }
            }

            System.out.println("Enter your ID and Phone number: ");
            verifyID = sc.next();
            verifyPhoneNumber = sc.next();
            boolean mached = false;
            for (User userDatum : SignUpSystem.UserData) {
                if (username.equals(userDatum.getUserName())){
                    if (verifyID.equals(userDatum.getIdNumber())){
                        if (verifyPhoneNumber.equals(userDatum.getPhoneNumber())) {
                            mached = true;
                            break;
                        }
                    }
                }
            }
            if(mached){
                System.out.println("You have verified successfully.");
                while (true){
                    System.out.println("Enter a new password: ");
                    String password1 = sc.next();
                    if(!UserRegistory.isPasswordLegalMethod(password1)){
                        System.out.println("Illegal password.");
                        continue;
                    }
                    System.out.println("Enter again: ");
                    String password2 = sc.next();
                    if (password2.equals(password1)){
                        for (User userDatum : SignUpSystem.UserData) {
                            if (verifyID.equals(userDatum.getIdNumber())){
                                userDatum.setPassword(password1);
                                break;
                            }
                        }
                        System.out.println("Password reset successfully. Jumping to Login page....");
                        LoginSystem.start();
                        return;
                    }
                    else {
                        System.out.println("Double check not passed, try again.");
                    }
                }
            }else {
                System.out.println("ID or phone number not matched. Leading to sign up page.....");
                SignUpSystem.start();
                return;
            }
        }
    }

    public static void main(String[] args) {
        start();
    }
}
