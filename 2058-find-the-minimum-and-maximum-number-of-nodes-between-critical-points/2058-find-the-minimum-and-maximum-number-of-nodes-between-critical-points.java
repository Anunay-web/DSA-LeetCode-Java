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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> ls = new ArrayList<>();
        ListNode curr = head;
        while(curr != null){
            ls.add(curr.val);
            curr = curr.next;
        }
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i = 1; i < ls.size() - 1; i++){
            if(ls.get(i - 1) < ls.get(i) && ls.get(i) > ls.get(i + 1)){
                temp.add(i);
                continue;
            }
             if(ls.get(i - 1) > ls.get(i) && ls.get(i) < ls.get(i + 1)){
                temp.add(i);
                continue;
            }
        }
        // if(ls.isEmpty()){
        //     return new int[]{-1, -1};
        // }
        if(temp.size() < 2){
            return new int[]{-1, -1};
        }
        int min  = Integer.MAX_VALUE;
        int max = temp.get(temp.size() - 1) - temp.get(0);
        for(int i = 1; i < temp.size(); i++){
            int distance = temp.get(i) - temp.get(i - 1);
            min = Math.min(min, distance);
        }
        return new int[] {min, max};
        
    }
}