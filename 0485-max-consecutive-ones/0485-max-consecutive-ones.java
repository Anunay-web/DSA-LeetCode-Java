class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int currentCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                currentCount++;
                count = Math.max(count, currentCount);
            }
            else{
                currentCount = 0;
            }
        }
        return count;
        
    }
}