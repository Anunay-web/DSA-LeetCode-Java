import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack(result, nums, visited, new ArrayList<>());
        return result;
    }

    private void backtrack(List<List<Integer>> result, int[] nums,
                           boolean[] visited, List<Integer> temp) {

        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;

            visited[i] = true;
            temp.add(nums[i]);

            backtrack(result, nums, visited, temp);

            temp.remove(temp.size() - 1);
            visited[i] = false;
        }
    }
}
