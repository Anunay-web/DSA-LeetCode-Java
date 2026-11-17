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
    public ListNode oddEvenList(ListNode head) {
        ListNode even = new ListNode(0);
        ListNode odd = new ListNode(0);
        ListNode e = even;
        ListNode o = odd;
        ListNode curr = head;
        int i = 0;
        while(curr != null){
            if(i % 2 == 0){
                e.next = curr;
                e = e.next;
            }
            else{
                o.next = curr;
                o = o.next;
            }
            curr = curr.next;
            i++;
        }
        e.next = odd.next;
        o.next = null;
        return even.next;
        
        
    }
}