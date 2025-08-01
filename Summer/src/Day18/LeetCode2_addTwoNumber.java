package Day18;

public class LeetCode2_addTwoNumber {

     public class ListNode {
         int val;
         ListNode next;

         ListNode() {
         }

         ListNode(int val) {
             this.val = val;
         }

         ListNode(int val, ListNode next) {
             this.val = val;
             this.next = next;
         }
     }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummyHead = new ListNode(0);
            ListNode current = dummyHead;
            int carry = 0;

            while (l1 != null || l2 != null || carry != 0){
                int val1 = (l1 != null) ? l1.val : 0;
                int val2 = (l2 != null) ? l2.val : 0;

                int sum = val1 + val2 + carry;
                int currentValue = sum % 10;
                carry = sum / 10;

                current.next = new ListNode(currentValue);
                current = current.next;

                if(l1 != null) l1 = l1.next;
                if(l2 != null) l2 = l2.next;

            }
            return dummyHead.next;
        }
    }
}
/*
* 5   4
* 5   5
* 0   1
*
* 0   0
*
*
* */
