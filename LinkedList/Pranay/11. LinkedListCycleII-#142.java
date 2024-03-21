/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val; // Node ka value
 *     ListNode next; // Agla node
 *     ListNode(int x) { // Constructor
 *         val = x; // Value ko set karo
 *         next = null; // Agla node ko null set karo
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head; // Slow pointer
        ListNode fast = head; // Fast pointer
        while (fast != null && fast.next != null) {
            fast = fast.next.next; // Fast pointer ko do steps aage badhao
            slow = slow.next; // Slow pointer ko ek step aage badhao
            if (fast == slow) { // Agar fast aur slow pointers ek dusre se milte hai
                slow = head; // Slow pointer ko head par reset karo
                while (slow != fast) { // Jab tak fast aur slow pointers ek nahi ho jaate
                    slow = slow.next; // Slow pointer ko aur ek step aage badhao
                    fast = fast.next; // Fast pointer ko ek step aage badhao
                }
                return slow; // Cycle ka starting point return karo
            }
        }
        return null; // Cycle nahi hai
    }
}
