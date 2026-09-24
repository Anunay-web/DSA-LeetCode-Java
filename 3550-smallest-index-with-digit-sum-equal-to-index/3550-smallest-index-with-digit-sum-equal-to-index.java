class Solution {
    public int smallestIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            int s = 0;
            while(n > 0){
                int temp = n % 10;
                n = n / 10;
                s += temp;
            }
            if(s == i){
                return i;
            }
        }
        return -1;
        
    }
}