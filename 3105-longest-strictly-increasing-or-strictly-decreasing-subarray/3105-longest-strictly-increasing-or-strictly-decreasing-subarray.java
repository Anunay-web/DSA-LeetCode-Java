class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int l1 = 1;
        int l1max = l1;
        int l2 = 1;
        int l2max = l2;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]){
                l2 = 1;
                l1++;
                l1max = Math.max(l1, l1max);
            }
            else if(nums[i] < nums[i - 1]){
                l1 = 1;
                l2++;
                l2max = Math.max(l2, l2max);
            }
            else{
                l1 = 1;
                l2 = 1;
            }

        }
        return Math.max(l1max, l2max);
        
    }
}