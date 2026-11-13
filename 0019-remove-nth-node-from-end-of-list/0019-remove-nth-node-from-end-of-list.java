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
      /*  ListNode temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }if(c==n){
            return head.next;
        }
        ListNode prev=null;
        ListNode curr=head;
        for(int i=0;i<c-n;i++){
            prev=curr;
            curr=curr.next;
        }prev.next=curr.next;
        return head;
        */
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode f=dummy;
        ListNode s=dummy;
        for(int i=0;i<=n;i++){
            f=f.next;
        }while(f!=null){
            f=f.next;
            s=s.next;
        }s.next=s.next.next;
        return dummy.next;
    }
}
