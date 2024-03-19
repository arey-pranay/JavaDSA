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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //initially total zero hai
        int total = 0;
        //ek temp node bnaya usko head pe rkha
        ListNode temp = head;
        //mtlb agr ek element hai, to wo delete hojayega
        if(head.next==null) return null;

        //mtlb 2 element 
        if(head.next.next == null){
            //ya to last delete hoga, ya fir second last (mtlb first)
            if(n==1) {
                head.next = null;
                return head;
            } else {
                head = head.next;
                return head;
            }
        }
        //total number of nodes count krlete hai
        while(temp!=null){
            total++;
            temp = temp.next;
        }
        //agr n aur total same hai, mtlb first hata hai
        if(n==total){
            head = head.next;
            return head;
        }

        int pos = total -n-1;
        int current =0;
        temp = head;
        for(int i=0; i<pos;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
