class Solution {
    public int longestConsecutive(int[] nums) {
        int ans = 1;
        if(nums.length == 0){
            return 0;
        }
        HashSet<Integer> hs = new HashSet<>();
        for(int n : nums){
            hs.add(n);
        }
        for(int n : hs){
            if(!hs.contains(n - 1)){
                int cnt = 1;
                int x = n;
                while(hs.contains(x + 1)){
                    x = x + 1;
                    cnt++;
                }
            ans = Math.max(ans, cnt);

            }
        }
        return ans;
        
    }
}