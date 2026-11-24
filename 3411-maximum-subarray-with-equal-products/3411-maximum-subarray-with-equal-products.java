class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int ans = 1;
        for(int i = 0; i < n - 1; i++){
            long l = nums[i];
            long g = nums[i];
            long p = nums[i];
            for(int j = i + 1; j < n; j++){
                p *= nums[j];
                g = gcd(g, nums[j]);
                l = l / gcd(l, nums[j]) * nums[j];
                if(p > g * l) break;
                if(p == (g * l)){
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }
    private long gcd(long a, long b){
        return b == 0 ? a : gcd(b, a % b);
    }
}