package Day22_Inheritance.animals;

public class Dog extends animal{


    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void drink(){
        System.out.println("Dog drinks");
    }

    public void houseKeeping(){
        System.out.println("Dog keeps house.");
    }
}
