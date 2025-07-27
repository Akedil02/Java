package Day3;

public class SimpleMethods {
    public static void main(String[] args) {

        int s1 = rectangleArea(10, 20);
        int s2 = rectangleArea(30, 50);

        compareArea(s1,s2);
    }

    public static void showInfo(){
        System.out.println("Name: John");
        System.out.println("Age: 20");
        System.out.println("Grade: A");
    }

    public static void showSum(int a, int b){
        int c = a+b;
        System.out.println(c);
    }

    public static int showSum2(int a, int b){
        int c = a+b;
        return c;
    }

    public static int rectangleArea(int a, int b){
        int s = a*b;
        return s;
    }

    public static void compareArea(int s1, int s2){
        if(s1>s2){
            System.out.println("S1 is bigger");
        } else if (s1<s2) {
            System.out.println("S2 is bigger");
        }
        else {
            System.out.println("Equal");
        }
    }




}
