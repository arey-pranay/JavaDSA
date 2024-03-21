/**
 * Ek-singular linked list ke liye definition.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head; // Agar list khali hai ya sirf ek element hai, toh use waise hi wapas karein
        int count = 0;
        ListNode x = head;
        while (x != null) {
            x = x.next;
            count++;
        } 
        k %= count; // 'k' ko 'count' se mod karein taaki humein effective rotations milen
        for (int i = 0; i < k; i++) {
            ListNode temp = head;
            while (temp.next.next != null) temp = temp.next; // End tak pahunchne ke liye
            ListNode start = new ListNode(temp.next.val); // Naya node banayein
            temp.next = null; // End node ko null kar dein
            start.next = head; // Naye node ko head bana dein
            head = start; // Head ko naye node se replace karein
        }
        return head;
    }
}
