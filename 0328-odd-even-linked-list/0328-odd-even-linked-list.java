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
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        ListNode curr = head;
        int i = 0;
        while(curr != null){
            if(i % 2 == 0){
                even.add(curr.val);
            }
            else{
                odd.add(curr.val);
            }
            curr = curr.next;
            i++;
        }
        curr = head;
        while(curr != null){
            for(int j = 0; j < even.size(); j++){
                curr.val = even.get(j);
                curr = curr.next;
            }
            for(int j = 0; j < odd.size(); j++){
                curr.val = odd.get(j);
                curr = curr.next;
            }
        }
        return head;
        
    }
}