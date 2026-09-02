class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            total += nums[i];
        }
        int rightSum = 0;
        for(int i = 0; i < nums.length; i++){
            rightSum = total - leftSum - nums[i];
            if(rightSum == leftSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
        
    }
}