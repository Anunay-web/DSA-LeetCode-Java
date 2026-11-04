class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        makeCombinations(k, 1, n, ans, new ArrayList<>());
        return ans;
    }
    public void makeCombinations(int k, int num, int n, List<List<Integer>> ans, ArrayList<Integer> ls){
        if(n == 0 && k == 0){
            ans.add(new ArrayList<>(ls));
            return;
        }
        for(int i = num; i < 10; i++){
            if(i > n && k <= 0){
                break;
            }
            ls.add(i);
            makeCombinations(k - 1, i + 1, n - i, ans, ls);
            ls.remove(ls.size() - 1);
        }
    }
}