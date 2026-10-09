class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int n : piles){
            max = Math.max(max, n);
        }
        int left = 1;
        int right = max;
        while(left <= right){
            int mid = (right + left)  / 2;
            int totalhrs = calc(piles, mid);
            if(totalhrs <= h){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
        
    }

    public static int calc(int[] piles, int n){
        int totalhrs = 0;
        for(int num : piles){
            totalhrs += Math.ceil((double) num / (double) n);
        }
        return totalhrs;
    }
}