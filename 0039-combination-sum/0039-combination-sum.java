class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        makeCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    public void makeCombinations(int idx, int[] candidates, int target, List<List<Integer>> ans, ArrayList<Integer> ls){
        if(idx == candidates.length){
            if(target == 0){
                ans.add(new ArrayList<>(ls));
            }
            return;
        }
        if(candidates[idx] <= target){
            ls.add(candidates[idx]);
            makeCombinations(idx, candidates, target - candidates[idx], ans, ls);
            ls.remove(ls.size() - 1);
        }
        makeCombinations(idx + 1, candidates, target, ans, ls);


    }
}