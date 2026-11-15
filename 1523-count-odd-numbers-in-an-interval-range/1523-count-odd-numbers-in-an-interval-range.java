class Solution {
    public int countOdds(int low, int high) {
        int count = 0;
        if(low % 2 == 0){
            low = low + 1;
        }
        for(int i = low; i < high; ){
            if(i % 2 == 1){
                count++;
            }
            i += 2;
        }
        if(high % 2 == 1){
            count++;
        }
        return count;
    }
}