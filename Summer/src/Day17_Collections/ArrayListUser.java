package Day17_Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> list = new ArrayList<>();
        User u1 = new User("1","Akedil","abcd123");
        User u2 = new User("2","John","abcd123");
        User u3 = new User("3","Wallace","abcd123");

        list.add(u1);
        list.add(u2);


        while (true){
            System.out.println("Inter the ID that you are searching(Inter 'q' to quit): ");
            String searchingID = sc.next();
            if (searchingID.equals("q")){
                break;
            }

            int currentID = SearchID(list,searchingID);

            if(currentID != -1){
                System.out.println("User found: " + list.get(currentID).toString());
            }else {
                System.out.println("User not found.");
            }

        }
    }

    public static int SearchID(ArrayList<User> list, String id){

        int currentIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                currentIndex = i;
                return currentIndex;
            }
        }
        return -1;
    }
}
