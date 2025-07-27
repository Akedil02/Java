package Day0;

import java.util.ArrayList;
import java.util.Scanner;

public class PassedPointsCount {
    ArrayList<Integer> points = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void inputscores(){

        System.out.println("Inter the points, inter any minus number to stop:");

        while (true){
            int point = scanner.nextInt();

            if(point < 0){
                break;
            }

            points.add(point);

        }

        System.out.println("Passed points: ");
        for(int i = 0; i < points.size(); i++){

            int pass = points.get(i);

            if(pass > 60){
                System.out.println(pass);
            }
        }
    }

}
