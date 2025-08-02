package Day19;


import java.util.Scanner;

public class LoginSystem {

    public static void start(){
        User admin = new User("Akedil123","1","1","1");
        UserRegistory.usedUsernames.add("Akedil123");
        SignUpSystem.UserData.add(admin);

        Scanner sc = new Scanner(System.in);

        System.out.println("****** Welcome to login page ******");
        outer:
        while (true){
            System.out.println("Enter your name");
            String username = sc.nextLine();
            if (!UserRegistory.isUsernameTakenMethod(username)){
                System.out.println("Username not found!");
                while (true){
                    System.out.println("Enter option number: ");
                    System.out.println("(1) Enter username again.");
                    System.out.println("(2) Sign up");

                    String option = sc.next();
                    sc.nextLine();

                    if (option.equals("1") || option.equals("2")) {
                        if (option.equals("1")) continue outer;
                        SignUpSystem.start();
                        return;
                    } else {
                        System.out.println("Invalid option, choose again");
                    }
                }
            }

            int chance = 3;
            while (chance > 0){
                System.out.println("Enter password: ");
                System.out.println("You have still " + chance +" times left.");
                String password = sc.next();
                boolean passwordMached = false;
                for (User userDatum : SignUpSystem.UserData) {
                    if (username.equals(userDatum.getUserName())){
                        if (password.equals(userDatum.getPassword())){
                            passwordMached = true;
                            break ;
                        }
                    }
                }
                if (passwordMached){
                    System.out.println("Password matched.");
                    break;
                } else {
                    chance --;
                    if (chance > 0) {
                        System.out.println("Wrong password. Try again.");
                    }
                }
            }
            if (chance == 0){
                System.out.println("Jumping to verifying page....");
                VerifyPassword.start();
                return;
            }

            System.out.println("Login successfully.");
            break;
        }
        StudentManagementSystem.start();
    }

    public static void main(String[] args) {
        start();
    }

}
