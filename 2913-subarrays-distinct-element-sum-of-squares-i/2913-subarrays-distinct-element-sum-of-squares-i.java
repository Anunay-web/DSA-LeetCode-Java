class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans = 0;
        for(int i = 0; i < nums.size(); i++){
            HashSet<Integer> ls = new HashSet<>();
            for(int j = i; j < nums.size(); j++){
                ls.add(nums.get(j));
                int sz = ls.size();
                ans += sz * sz;
            }
        }
        return ans;
    }
}