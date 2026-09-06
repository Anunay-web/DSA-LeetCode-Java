class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        int half = n / 2;
        long stSum = 0; 
        long hfSum = 0;
        for(int i = 0; i < half; i++){
            stSum += nums[i];
        }
        for(int i = half; i < n; i++){
            hfSum += nums[i];
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            if(stSum > hfSum){
                count++;
            }
            int out = nums[i];
            int in = nums[(i + half) % n];
            stSum = stSum - out + in;
            hfSum = hfSum + out - in;
        }
        return count;
    }
}