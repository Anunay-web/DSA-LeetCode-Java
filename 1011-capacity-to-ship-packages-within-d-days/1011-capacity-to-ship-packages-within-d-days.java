class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int n : weights){
            low = Math.max(low, n);
            high += n;
        }
        while(low <= high){
            int mid = (high + low) / 2;
            if(noOfD(mid, weights) <= days){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
    public static int noOfD(int n, int[] weights){
        int days = 1;
        int w = 0;
        for(int i = 0; i < weights.length; i++){
            if(w + weights[i] > n){
                days++;
                w = weights[i];
            }
            else{
                w += weights[i];
            }
        }
        return days;
    }
}