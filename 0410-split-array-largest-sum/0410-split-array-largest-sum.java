class Solution {
    public int splitArray(int[] nums, int k) {
        if(k > nums.length){
            return -1;
        }
        int low = 0;
        int high = 0;
        for(int n :  nums){
            low = Math.max(low, n);
            high += n;
        }
        while(low <= high){
            int mid = (low + high) / 2;
            if(calc(mid, nums) > k){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
    }
    public static int calc(int n, int[] nums){
        int x = 1;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(sum + nums[i] > n){
                sum = nums[i];
                x++;
            }
            else{
                sum += nums[i];
            }
        }
        return x;
    }
}