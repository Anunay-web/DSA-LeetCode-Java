class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int n : nums){
            sum += n;
            min = Math.min(n, min);
        }
        return sum - nums.length * min;
    }
}