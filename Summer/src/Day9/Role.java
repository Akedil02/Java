package Day9;

import java.util.Random;

public class Role {
    private String name;
    private int HP;


    public Role() {
    }

    public Role(String name, int HP) {
        this.name = name;
        this.HP = HP;
    }

    public void Hit(Role r){
        Random i = new Random();
        int Damage = i.nextInt(10,21);
        int remain = r.getHP() - Damage;
        if(remain < 0){
            remain = 0;
        }
        r.setHP(remain);
        System.out.println(this.name + " 给了 " + r.name + " 一击！, 造成 " + Damage + " 点伤害。"  + r.name+ " 剩余生命值: " + r.getHP());
    }



    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getHP() {
        return HP;
    }


    public void setHP(int HP) {
        this.HP = HP;
    }

    public String toString() {
        return "Role{name = " + name + ", HP = " + HP + "}";
    }
}
