class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> ls1 =  new ArrayList<>();
        ArrayList<Integer> ls2 =  new ArrayList<>();
        for(int n : nums){
            if(n >= 0){
                ls1.add(n);
            }
            else{
                ls2.add(n);
            }
        }
        int i = 0;
        int j = 0;
        for(int k = 0; k < nums.length; k++){
            if(k % 2 == 0){
                nums[k] = ls1.get(i);
                i++;
            }
            else{
                nums[k] = ls2.get(j);
                j++;
            }
        }
        return nums;
    }
}