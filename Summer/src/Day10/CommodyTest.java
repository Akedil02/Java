package Day10;

import Day0.S;

import java.util.Scanner;

public class CommodyTest {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Commody[] store = new Commody[3];

        Commody c1 = new Commody();
        System.out.println("First car: ");
        c1.setID(s.nextInt());
        c1.setName(s.next());
        c1.setPrice(s.nextFloat());
        c1.setQuantity(s.nextInt());

        System.out.println("Second car: ");
        Commody c2 = new Commody(s.nextInt(),s.next(),s.nextFloat(),s.nextInt());

        store[0] = c1;
        store[2] = c2;


        for (int i = 0; i < store.length; i++) {
            System.out.println(store[i]);
        }
    }


}
