class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        makeCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
    public void makeCombinations(int idx, int[] candidates, int target, List<List<Integer>> ans, ArrayList<Integer> ls){
        if(target == 0){
            ans.add(new ArrayList<>(ls));
        }
        for(int i = idx; i < candidates.length; i++){
            if(i > idx && candidates[i] == candidates[i - 1]){
                continue;
            }
            if(candidates[i] > target){
                break;
            }
            ls.add(candidates[i]);
            makeCombinations(i + 1, candidates, target - candidates[i], ans, ls);
            ls.remove(ls.size() - 1);
        }
    }
}