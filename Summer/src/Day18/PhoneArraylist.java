package Day18;

import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import java.util.ArrayList;

public class PhoneArraylist {
    public static void main(String[] args) {
        Phone p1 = new Phone("Xiao mi", 1000);
        Phone p2 = new Phone("Iphone", 8000);
        Phone p3 = new Phone("Samsung", 2999);

        ArrayList<Phone> list = new ArrayList<>();

        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> lessthan3000 = phoneLessthan3000(list);
        System.out.println(lessthan3000);

    }

    public static ArrayList<Phone> phoneLessthan3000(ArrayList<Phone> list){
        ArrayList<Phone> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getPrice() < 3000){
                result.add(list.get(i));
            }
        }
        return result;
    }
}
