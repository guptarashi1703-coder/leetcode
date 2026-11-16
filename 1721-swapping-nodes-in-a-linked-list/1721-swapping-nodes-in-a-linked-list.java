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
    public ListNode swapNodes(ListNode head, int k) {
       ListNode start=head;
       for(int i=1;i<k;i++){
        start=start.next;
       } ListNode n1=start;
       ListNode end=head;
       while(start.next!=null){
        start=start.next;
        end=end.next;
       }ListNode n2=end;
       int temp=n1.val;
       n1.val=n2.val;
       n2.val=temp;
       return head;
    }
}