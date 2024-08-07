class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode fwd = head.next;
        while(fwd!=null){
           curr.next = prev;
           prev = curr;
           curr = fwd;
           fwd = fwd.next;
        }
        curr.next = prev;
        return curr;
    }
}
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
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         //current, previous aur next bnadiya
//         ListNode p = null;
//         ListNode c = head;
//         ListNode n = head;
//         //agr koi node nhi hai to null return krna rhega
//         if(head != null){
//             n = c.next;
//             //jbtk next not null hai
//             while(n!=null){
//                 //revert the link of current node
//                 c.next = p;
//                 //shift remaining pointers
//                 p = c;
//                 c = n;
//                 n = n.next;
//             }  
//             //aakhri me ek pointer reh jaayega
//             c.next =p;   
//             return c;
//         } else {
//             //agr ek hi pointer hai to return head
//             return head;
//         }
       
//     }
// }
