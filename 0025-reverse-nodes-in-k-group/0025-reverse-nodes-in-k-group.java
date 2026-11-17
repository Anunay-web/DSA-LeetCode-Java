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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode result = new ListNode(0);
        ListNode res = result;
        ListNode curr = head;
        while(curr != null){
            Stack<ListNode> st = new Stack<>();
            int count = 0;
            ListNode end = curr;
            while(curr != null && count < k){
                st.push(curr);
                curr = curr.next;
                count++;
            }
            if(count < k){
                res.next = end;
                return result.next; 
            }

            while(!st.isEmpty()){
                res.next = st.pop();
                res = res.next;
            }
        }
        res.next = null;
        return result.next; 
    }
}