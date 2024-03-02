/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
      if(head==null){
        return false;
      }
      ArrayList<ListNode> a = new ArrayList<>();
      ListNode temp=head;
 while(temp.next!=null)
 {
   ListNode x= temp.next;

       if(a.contains(x)){
          return true;
        }
         a.add(x);
         temp=temp.next;
        

      }

 return false;
        
    }
}