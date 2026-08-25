class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean[] exist = new boolean[101];
        for(int num : nums){
            exist[num] = true;
        }
        int ans = k;
        while(ans < 101){
            if(!exist[ans]){
                return ans;
            }
            ans += k;
        }
        return ans;
        
    }
}