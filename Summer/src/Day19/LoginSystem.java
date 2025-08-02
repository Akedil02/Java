package Day19;


import java.util.Random;
import java.util.Scanner;

public class LoginSystem {

    public static void start(){
        User admin = new User("Akedil123","1","1","1");
        UserRegistory.usedUsernames.add("Akedil123");
        SignUpSystem.UserData.add(admin);

        Scanner sc = new Scanner(System.in);

        System.out.println("****** Welcome to login page ******");

        int chance = 3;

        outer:
        while (chance > 0){
            System.out.println("Current chance: " + chance);
            // username
            System.out.println("Enter your name: ");
            String username = sc.nextLine();

            //password
            System.out.println("Enter password: ");
            String password = sc.next();

            //human code
            while (true){
                String code = getCoed();
                System.out.println("Verify the code: " + code);
                String verifyCode = sc.next();
                if (code.equals(verifyCode)) {
                    System.out.println("Code verified.");
                    break;
                } else {
                    System.out.println("Wrong code, verify again.");
                }
            }
            User u = new User(username,password,null,null);
            if (!LoginMatched(u)){
                chance --;
                System.out.println("Invalid username or password. You have still " + chance + " times left.");
                while (true){
                    System.out.println("Enter option number: ");
                    System.out.println("(1) Try again.");
                    System.out.println("(2) Forgot password");
                    System.out.println("(3) Sign up");
                    System.out.println("(4) Exit");

                    String option = sc.next();
                    sc.nextLine();

                    switch (option) {
                        case "1" -> {
                            continue outer;
                        }
                        case "2" -> {
                            VerifyPassword.start();
                            return;
                        }
                        case "3" -> {
                            SignUpSystem.start();
                            return;
                        }
                        case "4" -> {
                            System.exit(0);
                        }

                        default -> System.out.println("Invalid option, choose again");
                    }
                }
            }
            else {
                break;
            }
        }

        if (chance == 0){
            System.out.println("Jumping to verifying page....");
            VerifyPassword.start();
            return;
        }
        System.out.println("Login successfully.");
        StudentManagementSystem.start();
    }

    public static void main(String[] args) {
        start();
    }

    public static String getCoed(){
        Random r = new Random();

        char[] chrs = new char[5];
        for (int i = 0; i < 4; i++){
            if(r.nextBoolean()){
                chrs[i] = (char) ('a'+ r.nextInt(26));
            }
            else{
                chrs[i] = (char) ('A'+ r.nextInt(26));
            }
        }
        chrs[4] = (char) ('0' + r.nextInt(10));

        for (int i = chrs.length-1; i > 0; i--) {
            int randomIndex = r.nextInt(i+1);
            char temp = chrs[i];
            chrs[i] = chrs[randomIndex];
            chrs[randomIndex] = temp;
        }

        return new String(chrs);
    }

    public static boolean passwordMatched(String username, String password){
        for (User userDatum : SignUpSystem.UserData) {
            if (username.equals(userDatum.getUserName())){
                if (password.equals(userDatum.getPassword())){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean LoginMatched(User u){
        return UserRegistory.isUsernameTakenMethod(u.getUserName()) && passwordMatched(u.getUserName(),u.getPassword());
    }



}
