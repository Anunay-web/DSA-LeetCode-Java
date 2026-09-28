class Solution {
    public void sortColors(int[] nums) {
        int[] freq = new int[301];
        for(int n : nums){
            freq[n]++;
        }
        int j = 0;
        for(int i = 0; i < 301; i++){
            while(freq[i] > 0){
                nums[j] = i;
                freq[i]--;
                j++;
            }
        }
    }
}