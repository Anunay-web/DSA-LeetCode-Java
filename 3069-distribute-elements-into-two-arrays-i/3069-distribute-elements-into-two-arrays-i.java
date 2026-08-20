class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> ls1 = new ArrayList<>();
        ArrayList<Integer> ls2 = new ArrayList<>();
        ls1.add(nums[0]);
        ls2.add(nums[1]);
        for(int i = 2; i < nums.length; i++){
            if(ls1.get(ls1.size() - 1) > ls2.get(ls2.size() - 1)){
                ls1.add(nums[i]);
            }
            else{
                ls2.add(nums[i]);
            }
        }
        int j = 0;
        for(int i = 0; i < ls1.size(); i++){
            nums[j] = ls1.get(i);
            j++;
        }
        for(int i = 0; i < ls2.size(); i++){
            nums[j] = ls2.get(i);
            j++;
        }
        return nums;
    }
}