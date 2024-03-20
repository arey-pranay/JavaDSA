/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            // If the node or its next node is null, we cannot delete it
            return;
        }
        
        // Copy the value of the next node to the current node
        node.val = node.next.val;
        // Point the current node to the node after the next node, effectively removing the next node
        node.next = node.next.next;
    }
}
