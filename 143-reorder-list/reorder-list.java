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
    public void reorderList(ListNode head) {
        if(head==null|| head.next==null){
            return ;
        }
        // 1.Find the middle and Split the List into two halves
        // We can do it using the Slow pointer and the Fast pointer
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        // 2.Note that from head to slow we are having the first half and from slow.next we are having the second half 
        // 3.We have to reverse the Second half and then merge with first half

        ListNode second=slow.next;
        slow.next=null;
        ListNode prev=null;
        
        while(second!=null){
            ListNode next=second.next;
            second.next=prev;
            prev=second;
            second=next;
        }
        // 4. Merge these two halves with help of head and prev hence these are the two heads of the two halves.
        ListNode first=head;
        second=prev;
        while(second!=null){
            ListNode firstNext=first.next;
            ListNode secondNext=second.next;
            first.next=second;
            second.next=firstNext;
            first=firstNext;
            second=secondNext;
        }

    }
}