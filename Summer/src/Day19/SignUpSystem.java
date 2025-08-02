package Day19;

import Day0.S;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SignUpSystem {

    public static Set<User> UserData = new HashSet<>();

    public static void start() {
        Scanner sc = new Scanner(System.in);
        String username = "";
        String password = "";
        String ID = "";
        String pn = "";

        System.out.println("****** WELCOME TO SIGN UP PAGE *******");
        while (true){
            System.out.println("Username should contain at least 3, most 15 chars, consist of letters and digits");
            System.out.println("Enter username: ");
            username = sc.nextLine();
            if (!UserRegistory.isUsernameCharsLegalMethod(username)){
                System.out.println("Username illegal. Try again.");
                continue;
            }
            if (UserRegistory.isUsernameTakenMethod(username)) {
                System.out.println("Username taken. Try again.");
            }else {
                System.out.println("Username created.");
                UserRegistory.usedUsernames.add(username);
                break;
            }
        }
        while (true){
            System.out.println("Enter password(longer than 5 characters): ");
            password = sc.next();
            if(!UserRegistory.isPasswordLegalMethod(password)){
                System.out.println("Password should be longer than 5 characters.");
                continue;
            }
            System.out.println("Verify password: ");
            String password2 = sc.next();
            if (!password2.equals(password)){
                System.out.println("Password not the same, try again.");
            }else {
                System.out.println("Password set successfully.");
                break;
            }
        }
        while (true){
            System.out.println("ID consists of 18 digits, first can not be 0, last can be x or X.");
            System.out.println("Enter personal ID: ");
            ID = sc.next();
            if(!UserRegistory.isIDLegalMethod(ID)){
                System.out.println("ID is illegal. Try again.");
            }else {
                System.out.println("ID saved.");
                break;
            }
        }
        while (true){
            System.out.println("Phone number consists of 11 digits, 1 can not be '0'.");
            System.out.println("Enter phone number: ");
            pn = sc.next();
            if (!UserRegistory.isPhoneNumberLegalMethod(pn)){
                System.out.println("Invalid phone number.");
            }else {
                System.out.println("Phone number saved.");
                break;
            }
        }

        User user = new User(username,password,ID,pn);
        UserData.add(user);
        System.out.println("User account created successfully. Jumping to Login....");
        LoginSystem.start();
    }

    public static void main(String[] args) {
        start();
    }
}
