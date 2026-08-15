class Solution {
    public int longestSubsequence(int[] nums) {
        int total = 0;
        boolean isNonzero = false;
        for(int num : nums){
            isNonzero |= num > 0;
            total ^= num;
        }
        if(total != 0){
            return nums.length;
        }

        if(isNonzero){
            return nums.length - 1;
        }

        return 0;
    }
}