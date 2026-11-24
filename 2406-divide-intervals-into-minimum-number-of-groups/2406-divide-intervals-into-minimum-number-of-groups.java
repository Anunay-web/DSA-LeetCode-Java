class Solution {
    public int minGroups(int[][] intervals) {
        int n = intervals.length;
        int[] begin = new int[n];
        int[] end = new int[n];
        for(int i = 0; i < n; i++){
            begin[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(begin);
        Arrays.sort(end);
        int arrivalIdx = 0;
        int endIdx = 0;
        int curr = 0;
        int ans = 0;
        while(arrivalIdx < n){
            if(begin[arrivalIdx] <= end[endIdx]){
                curr++;
                ans = Math.max(ans, curr);
                arrivalIdx++;
            }
            else{
                curr--;
                endIdx++;
            }
        }
        return ans;
    }
}