package Day8_OOP;

public class Girlfriend {
    String name;
    int height;
    int weight;
    private int age;

    public void spendmoney(){
        System.out.println("Babe I need to buy this purse");
    }

    public void lovey_dovery(){
        System.out.println("Babe I love you");
    }

    public void hungry(){
        System.out.println("I am so hungry! '_'~~~~");
    }

    public void setAge(int age) {
        if(age >= 18 && age <= 40){
            this.age = age;
        }else{
            System.out.println("This is not a fucking gf");
        }
    }

    public int getAge() {
        return age;
    }
}
