class Solution {
    public int beautySum(String s) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            int[] freq = new int[26];
            for(int j = i; j < s.length(); j++){
                freq[s.charAt(j) - 'a']++;
                int lowest = Integer.MAX_VALUE;
                int highest = Integer.MIN_VALUE;
            
            for(int num : freq){
                if(num > 0){
                lowest = Math.min(lowest, num);
                highest = Math.max(highest, num);
                }
            }
            ans += highest - lowest;
            }
        }
        return ans;
    }
}