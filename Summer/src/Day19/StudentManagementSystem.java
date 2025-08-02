package Day19;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void start(){
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("****** Welcome to Student management system ******");
        while (true){
            System.out.println("Inter the option number(1.add 2.delete 3.update 4.search 5.quite)");
            int option = sc.nextInt();
            if (option == 5) break;

            switch (option){
                case 1:
                    System.out.println("Enter the student you are adding(ID, name, age, home address): ");
                    addStudent(list,sc);
                    break;

                case 2:
                    System.out.println("Inter the student ID you want to remove: ");
                    String currentID = sc.next();
                    deleteStudent(list, currentID);
                    break;

                case 3:
                    System.out.println("Inter the student ID you want to update: ");
                    String UpdatingID = sc.next();
                    updateStudent(list, UpdatingID,sc);
                    break;

                case 4:
                    System.out.println("Inter the student ID you want to search: ");
                    String searchingID = sc.next();
                    Student s = searchStudent(list,searchingID);
                    if(s != null) System.out.println(s);
                    else System.out.println("Student not found");
                    break;

                default:
                    System.out.println("No such option.");
            }
        }
    }

    public static void main(String[] args) {

    }

    public static void addStudent(ArrayList<Student> list, Scanner sc) {
        String ID = sc.next();
        String Name = sc.next();
        int age = sc.nextInt();
        String HA = sc.next();
        if(!searchStudentBoolean(list, ID)){Student s = new Student(ID, Name, age, HA); list.add(s);}
        else{
            System.out.println("Student ID already exists!");
        }

    }

    public static void deleteStudent(ArrayList<Student> list, String ID){
        boolean b = list.remove(searchStudent(list,ID));
        if(b) System.out.println("Student removed successfully.");
        else System.out.println("Failed to remove student, check if student exists.");
    }

    public static Student searchStudent(ArrayList<Student> list, String ID){
        for (Student s : list) {
            if(s.getId().equals(ID)){
                return s;
            }
        }
        return null;
    }

    public static boolean searchStudentBoolean(ArrayList<Student> list, String ID){
        for (Student s : list) {
            if(s.getId().equals(ID)){
                return true;
            };
        }
        return false;
    }

    public static void updateStudent(ArrayList<Student> list, String id, Scanner sc){
        Student currentStudent = searchStudent(list,id);
        if (currentStudent != null){
            while (true){
                System.out.println("Inter the option number you want to change(1.ID, 2.name, 3.age, 4.home address. Enter 'q' to quite): ");
                String option = sc.next();
                if (option.equals("q")){
                    break;
                }
                switch (option){
                    case "1":
                        System.out.println( "Current ID: " + currentStudent.getId() +". Enter new ID: ");
                        String newID = sc.next();
                        if(!searchStudentBoolean(list, newID)){
                            currentStudent.setId(newID);
                            System.out.println("ID modified successfully.");
                        }else {
                            System.out.println("Student ID already exist!");
                        }

                        break;

                    case "2":
                        System.out.println("Current name: " + currentStudent.getName() + ". Enter new name: ");
                        String newName = sc.next();
                        currentStudent.setName(newName);
                        System.out.println("Name modified successfully.");
                        break;

                    case "3":
                        System.out.println("Current age: " + currentStudent.getAge() + ". Enter new age: ");
                        int newAge = sc.nextInt();
                        currentStudent.setAge(newAge);
                        System.out.println("Age modified successfully.");
                        break;

                    case "4":
                        System.out.println("Current home address: " + currentStudent.getHomeAdress() + ". Enter new home address: ");
                        String newHA = sc.nextLine();
                        currentStudent.setHomeAdress(newHA);
                        System.out.println("Home address modified successfully.");
                        break;

                    default:
                        System.out.println("No such option.");
                }
            }
        }else {
            System.out.println("Student not found.");
        }
    }


}


