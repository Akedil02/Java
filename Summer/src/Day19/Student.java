package Day19;

public class Student {
    private String id;
    private String name;
    private int age;
    private String homeAdress;

    public Student(){

    }

    public Student(String id, String name, int age, String homeAdress) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.homeAdress = homeAdress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getHomeAdress() {
        return homeAdress;
    }

    public void setHomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", homeAdress='" + homeAdress + '\'' +
                '}';
    }
}
