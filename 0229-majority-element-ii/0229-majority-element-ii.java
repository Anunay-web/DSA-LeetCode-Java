class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        ArrayList<Integer> ls = new ArrayList<>();
        for(Integer n : map.keySet()){
            if(map.get(n) > nums.length / 3){
                ls.add(n);
            }
        }
        return ls;
        
    }
}