package Day20;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Akedil");
        s.setAge(20);
        Student.setTeacherName("abc");

        Student s1 = new Student();
        s1.setName("John");
        s1.setAge(20);

        // ***** Features of STATIC keyword ******
        // 1) Members modified by static belong to CLASS, not to any specific object;
        // 2) Only one copy exists in memory, shared by all instances.
        // 3) Can be directly accessed via Class name --- no object needed. You can still access via an object name, but this is not recommended.
        // 4) Static members are loaded when class is loaded, before any object is created.
        // 5) High sharability, all instance share one static field or method.




        System.out.println(s);
        System.out.println(s1);
    }
}
