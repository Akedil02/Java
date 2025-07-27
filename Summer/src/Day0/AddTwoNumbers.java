package Day0;

public class AddTwoNumbers {

    class Listnode{

        int val;
        Listnode next;
        Listnode(int x){val = x;}
    }

    public class Solution{
        public Listnode Addtwonum(Listnode l1, Listnode l2){
            Listnode result = new Listnode(0);
            Listnode curr = result;
            int carry = 0;

            while (l1 != null || l2 != null || carry != 0){
                int x =(l1 != null)? l1.val:0;
                int y =(l2 != null)? l2.val:0;

                int sum = x+y+carry;
                carry = sum / 10;
                int digit = sum % 10;

                curr.next = new Listnode(digit);
                curr = curr.next;

                if(l1 != null) l1 = l1.next;
                if(l2 != null) l2 = l2.next;
            }

            return result.next;
        }
    }


}
