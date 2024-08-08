/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val; // Node ka value
 *     ListNode next; // Agla node
 *     ListNode() {} // Constructor
 *     ListNode(int val) { this.val = val; } // Constructor
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; } // Constructor
 * }
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val; // Node ka value
 *     ListNode next; // Agla node
 *     ListNode() {} // Constructor
 *     ListNode(int val) { this.val = val; } // Constructor
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; } // Constructor
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head; // Fast pointer jo 2 steps aage badhta hai
        ListNode slow = head; // Slow pointer jo 1 step aage badhta hai
        ListNode reversed = null; // Reverse kiya hua linked list
        
        // Linked list ke beech tak fast aur slow pointers ko move karo
        // Aur reverse karte jao slow pointer ke peeche
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            ListNode next = slow.next;
            slow.next = reversed;
            reversed = slow;
            slow = next;
        }
        
        // Agar fast pointer aage hai toh slow ko ek step aage badhao
        if (fast != null) {
            slow = slow.next;
        }
        
        // Ab slow aur reversed pointers ko compare karo
        while (slow != null) {
            if (slow.val != reversed.val) { // Agar value match nahi karti, toh palindrome nahi hai
                System.gc(); // Garbage collector ko call karo
                return false;
            }

            slow = slow.next; // Next nodes par move karo
            reversed = reversed.next; // Next nodes par move karo
        }

        System.gc(); // Garbage collector ko call karo
        return true; // Agar sab match hai, toh palindrome hai
    }
}

// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         ListNode fast = head; // Fast pointer jo 2 steps aage badhta hai
//         ListNode slow = head; // Slow pointer jo 1 step aage badhta hai
//         ListNode reversed = null; // Reverse kiya hua linked list
        
//         // Linked list ke beech tak fast aur slow pointers ko move karo
//         // Aur reverse karte jao slow pointer ke peeche
//         while (fast != null && fast.next != null) {
//             fast = fast.next.next;
//             ListNode next = slow.next;
//             slow.next = reversed;
//             reversed = slow;
//             slow = next;
//         }
        
//         // Agar fast pointer aage hai toh slow ko ek step aage badhao
//         if (fast != null) {
//             slow = slow.next;
//         }
        
//         // Ab slow aur reversed pointers ko compare karo
//         while (slow != null) {
//             if (slow.val != reversed.val) { // Agar value match nahi karti, toh palindrome nahi hai
//                 System.gc(); // Garbage collector ko call karo
//                 return false;
//             }

//             slow = slow.next; // Next nodes par move karo
//             reversed = reversed.next; // Next nodes par move karo
//         }

//         System.gc(); // Garbage collector ko call karo
//         return true; // Agar sab match hai, toh palindrome hai
//     }
// }
