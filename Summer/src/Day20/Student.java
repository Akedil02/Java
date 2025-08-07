package Day20;

public class Student {
    private String name;
    private int age;
    private static String teacherName;


    public Student() {
    }

    public Student(String name, int age, String teacherName) {
        this.name = name;
        this.age = age;
        Student.teacherName = teacherName;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getTeacherName() {
        return teacherName;
    }

    public static void setTeacherName(String teacherName) {
        Student.teacherName = teacherName;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", teacherName = " + teacherName + "}";
    }
}
