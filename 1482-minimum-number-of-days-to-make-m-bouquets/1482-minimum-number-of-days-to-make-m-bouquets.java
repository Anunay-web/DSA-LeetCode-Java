class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m * k > bloomDay.length){
            return -1;
        }
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int n : bloomDay){
            low = Math.min(low, n);
            high = Math.max(high, n);
        }
        while(low <= high){
            int mid = low + (high - low)/ 2;
            if(valid(bloomDay, mid, m, k)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public static boolean valid(int[] bloomDay, int val, int m, int k){
        int noOfD = 0;
        int count = 0;
        for(int i = 0; i < bloomDay.length; i++){
            if(bloomDay[i] <= val){
                count++;
            }
            else{
                noOfD += count / k;
                count = 0;
            }
        }
        noOfD += count / k;
        return noOfD >= m;
    }
}