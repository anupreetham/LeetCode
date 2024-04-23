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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        ListNode curr = head;
        ListNode nxt= head.next;
        ListNode pre=head;
         
            while(curr!=null){
                if(curr.val==val ){
                     pre.next=nxt;
                    curr=nxt;
                   // nxt=nxt.next;
                 }
                else{
                    pre=curr;
                    curr=nxt;
                    //nxt=nxt.next;
                }
                if(nxt!=null) nxt=nxt.next;
            }
             if(head.val==val) head=head.next;
    
       return head; 
    }
}