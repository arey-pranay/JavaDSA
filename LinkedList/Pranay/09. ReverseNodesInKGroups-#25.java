import java.util.ArrayList;

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        // Initialize an array list to store the reversed groups
        ArrayList<ListNode> reversedGroups = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            ListNode start = temp; // Current group's starting node
            ListNode end = getKthNode(temp, k); // Get the kth node from the current position
            
            if (end == null) {
                reversedGroups.add(start); // Add the remaining nodes as they are
                break;
            }
            
            ListNode next = end.next; // Store the next node after the kth node
            end.next = null; // Disconnect the current group from the following nodes
            reversedGroups.add(reverseList(start)); // Reverse the current group and add it to the list
            temp = next; // Move temp to the next group's starting node
        }

        // Concatenate all the reversed groups into a single list
        ListNode result = null;
        for (ListNode group : reversedGroups) {
            result = concatLists(result, group);
        }

        return result;
    }

    // Function to get the kth node from a given node
    private ListNode getKthNode(ListNode start, int k) {
        while (start != null && k > 1) {
            start = start.next;
            k--;
        }
        return start;
    }

    // Function to reverse a linked list
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    // Function to concatenate two linked lists
    private ListNode concatLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        ListNode temp = list1;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = list2;
        return list1;
    }
}
