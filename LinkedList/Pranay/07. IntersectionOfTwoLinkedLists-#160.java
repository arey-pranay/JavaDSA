/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr1=headA;
        ListNode curr2=headB;
        int count1=0;
        int count2=0;
        //pehle linked list 1 ke number of elements rkhliye
        while(curr1!=null){
            curr1=curr1.next;
            count1++;
        }
        //fir linked list 2 ke number of elements rkhliye
        while(curr2!=null){
            curr2=curr2.next;
            count2++;
        }
        //dono me same number of elements bache ho, wahan tk traverse krwado

        //agr linkedlist1 me zyada elements hai to aage bdhao tbtk, jbtk remaining elements, linkedlist2 ke total elements ke count ke barabar ho
        while(count1 > count2){
            headA=headA.next;
            count1--;
        }
        //agr linkedlist2 me zyada elements hai to aage bdhao tbtk, jbtk remaining elements, linkedlist1 ke total elements ke count ke barabar ho
        while(count1 < count2){
            headB=headB.next;
            count2--;
        }
        //ab dono list me same number of remaining elements hai, to headA aur headB dono ko aage bdhaate rho, jbtk same na aaye. 
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        //jese hi same aaye, return krdo
        return headB;

    }
}
