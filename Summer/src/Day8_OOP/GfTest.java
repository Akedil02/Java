package Day8_OOP;

public class GfTest {
    public static void main(String[] args) {
        Girlfriend gf = new Girlfriend();
        gf.name = "Zhuzhu";
        gf.height = 165;
        gf.weight = 50;
        gf.setAge(17);

        System.out.println(gf.name);
        System.out.println(gf.getAge());
        gf.spendmoney();
        gf.hungry();
        gf.lovey_dovery();

    }
}
