class Solution {
    public int minMoves(int[] nums) {
        int max = 0;
        for(int n : nums){
            if(n > max){
                max = n;
            }
        }
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            while(nums[i] < max){
                ans++;
                nums[i]++;
            }
        }
        return ans;
        
    }
}