class Solution {
    public long maxAlternatingSum(int[] nums) {
        long ans = 0;
        Arrays.sort(nums);
        ArrayList<Integer> ls = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        while(i < n){
            if(nums[i] > 0) break;
            ls.add(Math.abs(nums[i]));
            i++;
        }
        for(int j = 0; j < i; j++){
            nums[j] = ls.get(i - j - 1);
        }
        Arrays.sort(nums);
        i = 0;
        for(int k = n - 1; k >= n / 2; k--){
            ans += (long)(nums[k] * nums[k]);
            ans -= (long)(nums[i] * nums[i]);
            i++;
        }
        if(n % 2 != 0){
            ans += (long)(nums[n/2] * nums[n/2]);
        }
        return ans;

    }
}