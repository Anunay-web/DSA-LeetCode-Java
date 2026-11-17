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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i = 0; i < lists.length; i++){
            ListNode current = lists[i];
            while(current != null){
                ls.add(current.val);
                current = current.next;
            }
        }
        Collections.sort(ls);
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(int n : ls){
            curr.next = new ListNode(n);
            curr = curr.next;
        }
        curr.next = null;
        return dummy.next;
    }
}