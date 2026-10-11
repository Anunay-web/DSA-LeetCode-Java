class Solution {
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        int n = nums.length;
        sum += nums[0] * nums[0];
        if(n > 1) sum += nums[n - 1] * nums[n - 1];
        for(int i =  2 ; i < n ; i++){
            if(n % i == 0){
                sum += nums[i - 1] * nums[i - 1];
            }
        }
        return sum;
        
    }
}