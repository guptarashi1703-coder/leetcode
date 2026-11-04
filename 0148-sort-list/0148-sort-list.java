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
    public ListNode sortList(ListNode head) {
     ListNode f=head;
     ListNode s=head;
     ListNode prev=null;
     if(head==null || head.next==null){
        return head;
     }while(f!=null && f.next!=null){
        prev=s;
        s=s.next;
        f=f.next.next;
     }  prev.next=null;
     ListNode first=sortList(head);
      ListNode second=sortList(s);
      return merge(first,second);
    }
    public ListNode merge(ListNode first,ListNode second){
     ListNode dummy=new ListNode(-1);
     ListNode curr=dummy;
     while(first!=null && second!=null){
        if(first.val<=second.val){
        curr.next=first;
        first=first.next;
        }else{
        curr.next=second;
        second=second.next;
     }curr=curr.next;
     }if(first!=null){
        curr.next=first;
        }else{
            curr.next=second;
        }
     return dummy.next;
    }
}