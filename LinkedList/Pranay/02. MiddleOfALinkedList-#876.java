/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        //jbtk fast end pr nhi pohcha
        while(fast != null){
            if(fast.next==null) {//odd numbers 
               return slow;
            } else if(fast.next.next == null){ //even number
                return slow.next;
            }
            else {
                fast = fast.next.next; //fast ek baar me 2 steps chlta hai
                slow = slow.next; //slow ek baar me ek step chlta hai
            }
            //jb fast end pe pohch jayega tb slow mid pe hoga
        }
        return slow;
    }
}
