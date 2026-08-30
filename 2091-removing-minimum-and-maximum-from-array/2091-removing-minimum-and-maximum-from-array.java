class Solution {
    public int minimumDeletions(int[] nums) {
        int maxIndex = 0;
        int minIndex = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] > nums[maxIndex]){
                maxIndex = i;
            }
            if(nums[i] < nums[minIndex]){
                minIndex = i;
            }
        }
        int l = Math.max(maxIndex, minIndex) + 1;
        int r = n - Math.min(maxIndex, minIndex);
        int both = Math.min(maxIndex, minIndex) + 1 + n - Math.max(maxIndex, minIndex);
        return Math.min(both, Math.min(l, r));

        
    }
}