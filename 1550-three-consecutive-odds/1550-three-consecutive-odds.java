class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        int Mcount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                count = 0;
            }
            else{
                count++;
                Mcount = Math.max(Mcount, count);
            }
        }
        return Mcount >= 3;
        
    }
}