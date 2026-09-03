class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums1.length; i++){
            if(nums1[i] % 2 == 1){
                min = Math.min(min, nums1[i]);
            }
        }
        if(min == Integer.MAX_VALUE){
            return true;
        }
        for(int num : nums1){
            if(num % 2 == 0 && num <= min){
                return false;
            }
        }
        return true;
    }
}