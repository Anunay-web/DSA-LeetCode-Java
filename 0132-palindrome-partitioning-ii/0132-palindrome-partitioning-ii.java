class Solution {
    public int minCut(String s) {
        int n = s.length();
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return cut(s, 0, n , dp) - 1; 

    }
    public int cut(String s, int i, int n, int[] dp){
        if(i == n){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int minCost = Integer.MAX_VALUE;
        for(int j = i; j < n; j++){
            if(isPalindrome(s, i, j)){
                int cost = 1 + cut(s, j + 1, n, dp);
                minCost = Math.min(minCost, cost);
            }
        }
        return dp[i] = minCost;
    }
    public boolean isPalindrome(String s, int i, int j){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}