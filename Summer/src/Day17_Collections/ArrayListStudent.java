package Day17_Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Inter the first student: ");
        Student s1 = new Student(sc.next(), sc.nextInt());
        System.out.println("Inter the second student: ");
        Student s2 = new Student(sc.next(), sc.nextInt());

        list.add(s1);
        list.add(s2);

        System.out.println(list);
    }
}
