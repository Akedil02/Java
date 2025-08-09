package Day22_Inheritance.animals;

public class Test {
    public static void main(String[] args) {

        Dog dog = new Dog();

        System.out.println(dog);
        dog.drink();
        dog.eat();
        dog.houseKeeping();

        Teddy ted = new Teddy();
        ted.touch();
        ted.eat();
    }
}
