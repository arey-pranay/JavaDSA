/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val; // value ko store karne ke liye
 *     ListNode next; // next node ko point karne ke liye
 *     ListNode() {} // constructor
 *     ListNode(int val) { this.val = val; } // constructor
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; } // constructor
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0; // carry ko store karne ke liye
        ListNode head = null; // shuruaati node
        ListNode tail = null; // last node
        while(l1 != null || l2 != null)
        {
            int sum = 0; // dono node ke yog ko store karne ke liye
            if(carry != 0)
            {
                sum += carry--; // carry ko ghatayein
            } 
            if(l1 != null)
            {
                sum += l1.val; // l1 ke value ko sum mein jodna
                l1 = l1.next; // next node par move karein
            }

            if(l2 != null)
            {
                sum += l2.val; // l2 ke value ko sum mein jodna
                l2 = l2.next; // next node par move karein
            }

            if(sum > 9)
            {
                sum -= 10; // carry nikalna
                carry = 1; // carry ko set karein
            }

            ListNode temp = new ListNode(sum); // naya node banayein
            if(tail != null)
            {
                tail.next = temp; // purane node ke next mein naya node set karein
            }
            else
            {
                head = temp; // agar ye pehli node hai, toh head ko set karein
            }
            
            tail = temp; // tail ko update karein
        }

        if(carry != 0)
        {
            tail.next = new ListNode(carry); // agar carry bacha hai, toh usko add karein
        }
        return head; // head node ko return karein
    }
}
// high time taken
//import java.math.BigInteger;

// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         if(l1.val==0 && l2.val==0 && l1.next==null && l2.next==null) return new ListNode(0);
//         BigInteger num1 = new BigInteger("0");
//         BigInteger num2 = new BigInteger("0");
//         int pow1 = 0;
//         int pow2 = 0;

//         ListNode temp1 = l1;
//         ListNode temp2 = l2;

//         while (temp1 != null) {
//             num1 = num1.add(BigInteger.valueOf(temp1.val).multiply(BigInteger.TEN.pow(pow1)));
//             pow1++;
//             temp1 = temp1.next;
//         }

//         while (temp2 != null) {
//             num2 = num2.add(BigInteger.valueOf(temp2.val).multiply(BigInteger.TEN.pow(pow2)));
//             pow2++;
//             temp2 = temp2.next;
//         }

//         BigInteger sum = num1.add(num2);
//         ListNode dummyHead = new ListNode();
//         ListNode temp = dummyHead;

//         while (!sum.equals(BigInteger.ZERO)) {
//             int digit = sum.mod(BigInteger.TEN).intValue();
//             temp.next = new ListNode(digit);
//             temp = temp.next;
//             sum = sum.divide(BigInteger.TEN);
//         }

//         return dummyHead.next;
//     }
// }
