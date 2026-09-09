class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0, r = 0; i < nums.length; i++) {
            r = ((r + nums[i]) % k + k) % k;
            map.put(r, map.getOrDefault(r, 0) + 1);
        }
        int result = map.getOrDefault(0, 0);
        for (int frequency : map.values())
            result += frequency * (frequency - 1) / 2;
        return result;
    }
}