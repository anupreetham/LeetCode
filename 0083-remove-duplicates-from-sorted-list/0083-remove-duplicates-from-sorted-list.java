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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
     ListNode curr =head;
     ListNode nxt=head.next;
     while(curr!=null && nxt!=null){
        if(curr.val==nxt.val){
            nxt= nxt.next;
            curr.next=nxt;
        }
        else {
            curr=nxt;
            nxt=nxt.next;

        }

     } 
      return head;  
    }
}