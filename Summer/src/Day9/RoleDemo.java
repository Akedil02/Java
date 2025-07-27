package Day9;

public class RoleDemo {
    public static void main(String[] args) {
        Role r1 = new Role("Akedil", 100);
        Role r2 = new Role("Akmar",100);

        while (true) {
            if (r1.getHP() > 0) {
                r1.Hit(r2);
                if (r2.getHP() <= 0) {
                    System.out.println(r1.getName() + " 摧毁了 " + r2.getName() + " !");
                    break;
                }
            }

            if (r2.getHP() > 0) {
                r2.Hit(r1);
                if (r1.getHP() <= 0) {
                    System.out.println(r2.getName() + " 摧毁了 " + r1.getName() + " !");
                    break;
                }
            }
        }





    }
}
