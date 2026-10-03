class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int high = 0;
        for(int n : nums){
            high = Math.max(high, n);
        }
        int low = 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(sum(nums, mid) <= threshold){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
        
    }
    public static int sum(int[] nums, int i){
        int sum = 0;
        for(int n : nums){
            sum += Math.ceil((double) n / i);
        }
        return sum;
    }
}