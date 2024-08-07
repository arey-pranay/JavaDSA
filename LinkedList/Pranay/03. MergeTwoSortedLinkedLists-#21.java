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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return  list2;
        if(list2 == null) return list1;
        ListNode dummy = new ListNode();
        ListNode temp = new ListNode();
        if(list1.val < list2.val){
            temp = list1;
            list1 = list1.next;
        }
        else {
            temp = list2;
            list2 = list2.next;
        }
        dummy.next = temp;
        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                temp.next = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        while(list1 != null){
            temp.next = list1;
            list1 = list1.next;
            temp = temp.next;
        }
        while(list2 != null){
            temp.next = list2;
            list2 = list2.next;
            temp = temp.next;
        }
        return dummy.next;
    }
}
// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         //ek ListNode. modify krne ke liye
//         ListNode modifier = new ListNode();
//         //list1 aur list2 traverse krne ke liye
//         ListNode temp1 = list1;
//         ListNode temp2 = list2;
//         //agr ek bhi list null hai to dusri list return krdo
//         if (list1 == null) return list2;
//         if (list2 == null) return list1;
//         //jiska value chhota hai wo wali list me jodenge
//         ListNode mergedHead;
//         if (list1.val <= list2.val) {
//             mergedHead = list1;
//         } else {
//             mergedHead = list2;
//         }
//         //if both exist. this loop will break when either of them will be null
//         while (temp1 != null && temp2 != null) {
//             //agr temp1 ki val chhoti hai, to modifier ka next wahan point krwa ke aage bdha do, nhi to temp2 ke saath krdo esa hi same
//             if (temp1.val <= temp2.val) {
//                 modifier.next = temp1;
//                 temp1 = temp1.next;
//             } else {
//                 modifier.next = temp2;
//                 temp2 = temp2.next;
//             }
//             modifier = modifier.next;
//         }
//         //agr temp1 khaali nhi hai, mtlb temp 2 khaali hai. to modifier ke next pe bachi hui poori temp1 attach krdo  ya jod do 
//         if (temp1 != null) {
//             modifier.next = temp1;
//         } else { //agr temp1 khaali hai to temp2 jod do
//             modifier.next = temp2;
//         }
//         //return krdo mergedHead, jisko modifier ki madad se modify kara tha wo merging the two linked lists.
//         return mergedHead;
//     }
// }
