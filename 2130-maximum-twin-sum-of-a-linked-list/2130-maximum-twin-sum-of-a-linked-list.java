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
    public int pairSum(ListNode head) {
      ArrayList<Integer> list=new ArrayList<>();
      ListNode temp=head;
      while(temp!=null){
        list.add(temp.val);
        temp=temp.next;
      }  int l=0;
      int r=list.size()-1;
      int maxs=0;
      while(l<r){
        int s=list.get(l)+list.get(r);
        if(s>maxs)
        maxs=s;
        l++;
        r--;
      }return maxs;
    }
}