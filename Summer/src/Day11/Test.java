package Day11;

import Day0.S;

public class Test {
    public static void main(String[] args) {
        Student[] arr = new Student[6];

        Student s1 = new Student("Akedil", 1, 20);
        Student s2 = new Student("Erasyl", 2, 20);
        Student s3 = new Student("Peil", 3, 19);

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;


        Student s4 = new Student("Halamat", 4, 21);

        addelem(arr,s4);

        Student s5 = new Student("Soloman", 5, 21);

        arr = addelem(arr, s5);

        delete(arr,3);

        AddOneToAge(arr, 5);

        System.out.println();
        print(arr);




    }

    public static void AddOneToAge(Student[] arr, int ID){
        if(contains(arr,ID)){
            int i = fintIdIndex(arr,ID);
            arr[i].setAge(arr[i].getAge()+1);
        }
        else{
            System.out.println("No current ID found");
        }
    }

    public static Student[] addelem(Student[] arr, Student s){

        if(contains(arr,s.getID())){
            System.out.println("ID already exists, pls modify the ID");
            return arr;
        }
        else{
            int count = getcount(arr);
            if(count == arr.length){
                Student[] SpaceNotEnoughArray = newArray(arr, s);
                System.out.println("This adding progress ");
                return SpaceNotEnoughArray;
            }else{
                arr[count] = s;
                return arr;
            }
        }
    }

    public static void delete(Student[] arr, int ID){
        if(contains(arr,ID)){
            int index = fintIdIndex(arr,ID);
            arr[index] = null;
        }
        else {
            System.out.println("No current ID found");
        }
    }

    public static int fintIdIndex(Student[] arr, int ID){
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null && arr[i].getID() == ID){
                index = i;
                return index;
            }
        }

        return -1;
    }

    public static void print(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                System.out.println(arr[i].getID() +" " + arr[i].getName() + " " + arr[i].getAge());
            }
        }
    }
    
    public static boolean contains(Student[] arr, int s){
        return fintIdIndex(arr,s) != -1;
    }

    public static int getcount(Student[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                count ++;
            }
        }

        return count;
    }

    public static Student[] newArray(Student[] arr, Student s){
        Student[] brr = new Student[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i];
        }
        brr[brr.length-1] = s;

        return brr;
    }

}
