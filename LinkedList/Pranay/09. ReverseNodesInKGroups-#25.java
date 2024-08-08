// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) return head;

        // Step 1: Calculate the length of the list
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        // Step 2: Reverse in groups of k
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prevGroupEnd = dummy;
        ListNode groupStart = head;

        while (length >= k) {
            ListNode prev = null;
            ListNode curr = groupStart;
            // Reverse k nodes
            for (int i = 0; i < k; i++) {
                ListNode nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }
            // Connect reversed group to the previous part of the list
            prevGroupEnd.next = prev;
            groupStart.next = curr;
            prevGroupEnd = groupStart;

            // Move to the next group
            groupStart = curr;
            length -= k;
        }

        return dummy.next;
    }
}

// public class Solution {
//     public ListNode reverseKGroup(ListNode head, int k) {
//         ListNode curr = head;
//         int count = 0;
//         while (curr != null && count != k) { // find the k+1 node
//             curr = curr.next;
//             count++;
//         }
//         if (count == k) { // if k+1 node is found
//             curr = reverseKGroup(curr, k); // reverse list with k+1 node as head
//             // head - head-pointer to direct part,
//             // curr - head-pointer to reversed part;
//             while (count-- > 0) { // reverse current k-group:
//                 ListNode tmp = head.next; // tmp - next head in direct part
//                 head.next = curr; // preappending "direct" head to the reversed list
//                 curr = head; // move head of reversed part to a new node
//                 head = tmp; // move "direct" head to the next node in direct part
//             }
//             head = curr;
//         }
//         return head;
//     }
// }

// public class Solution {
// public ListNode reverseKGroup(ListNode head, int k) {
// if (head==null||head.next==null||k<2) return head;

// ListNode dummy = new ListNode(0);
// dummy.next = head;

// ListNode tail = dummy, prev = dummy,temp;
// int count;
// while(true){
// count =k;
// while(count>0&&tail!=null){
// count--;
// tail=tail.next;
// }
// if (tail==null) break;//Has reached the end

// head=prev.next;//for next cycle
// // prev-->temp-->...--->....--->tail-->....
// // Delete @temp and insert to the next position of @tail
// // prev-->...-->...-->tail-->head-->...
// // Assign @temp to the next node of @prev
// // prev-->temp-->...-->tail-->...-->...
// // Keep doing until @tail is the next node of @prev
// while(prev.next!=tail){
// temp=prev.next;//Assign
// prev.next=temp.next;//Delete

// temp.next=tail.next;
// tail.next=temp;//Insert

// }

// tail=head;
// prev=head;

// }
// return dummy.next;

// }
// }

// class Solution {
//     public ListNode reverseKGroup(ListNode head, int k) {
//         if (head == null || k <= 1) return head;

//         // Step 1: Calculate the length of the list
//         int length = 0;
//         ListNode current = head;
//         while (current != null) {
//             length++;
//             current = current.next;
//         }

//         // Step 2: Reverse in groups of k
//         ListNode dummy = new ListNode(-1);
//         dummy.next = head;
//         ListNode prevGroupEnd = dummy;
//         ListNode groupStart = head;

//         while (length >= k) {
//             ListNode prev = null;
//             ListNode curr = groupStart;
//             // Reverse k nodes
//             for (int i = 0; i < k; i++) {
//                 ListNode nextNode = curr.next;
//                 curr.next = prev;
//                 prev = curr;
//                 curr = nextNode;
//             }
//             // Connect reversed group to the previous part of the list
//             prevGroupEnd.next = prev;
//             groupStart.next = curr;
//             prevGroupEnd = groupStart;

//             // Move to the next group
//             groupStart = curr;
//             length -= k;
//         }

//         return dummy.next;
//     }
// }




// import java.util.ArrayList;

// class Solution {
//     public ListNode reverseKGroup(ListNode head, int k) {
//         // Initialize an array list to store the reversed groups
//         ArrayList<ListNode> reversedGroups = new ArrayList<>();
//         ListNode temp = head;
//         while (temp != null) {
//             ListNode start = temp; // Current group's starting node
//             ListNode end = getKthNode(temp, k); // Get the kth node from the current position
            
//             if (end == null) {
//                 reversedGroups.add(start); // Add the remaining nodes as they are
//                 break;
//             }
            
//             ListNode next = end.next; // Store the next node after the kth node
//             end.next = null; // Disconnect the current group from the following nodes
//             reversedGroups.add(reverseList(start)); // Reverse the current group and add it to the list
//             temp = next; // Move temp to the next group's starting node
//         }

//         // Concatenate all the reversed groups into a single list
//         ListNode result = null;
//         for (ListNode group : reversedGroups) {
//             result = concatLists(result, group);
//         }

//         return result;
//     }

//     // Function to get the kth node from a given node
//     private ListNode getKthNode(ListNode start, int k) {
//         while (start != null && k > 1) {
//             start = start.next;
//             k--;
//         }
//         return start;
//     }

//     // Function to reverse a linked list
//     private ListNode reverseList(ListNode head) {
//         ListNode prev = null;
//         ListNode curr = head;
//         while (curr != null) {
//             ListNode nextTemp = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = nextTemp;
//         }
//         return prev;
//     }

//     // Function to concatenate two linked lists
//     private ListNode concatLists(ListNode list1, ListNode list2) {
//         if (list1 == null) return list2;
//         ListNode temp = list1;
//         while (temp.next != null) {
//             temp = temp.next;
//         }
//         temp.next = list2;
//         return list1;
//     }
// }
