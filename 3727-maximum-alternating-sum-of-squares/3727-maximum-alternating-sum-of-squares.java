class Solution {
    public long maxAlternatingSum(int[] nums) {
        long sum = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        for(int i = 0; i < n / 2; i++){
            sum -= (long) nums[i] * nums[i];
            sum += (long) nums[n - i - 1] * nums[n - i - 1];
        }
        if(n % 2 != 0){
            sum += nums[n / 2] * nums[n / 2];
        }
        return sum;
        
    }
}