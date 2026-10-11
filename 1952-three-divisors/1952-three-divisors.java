class Solution {
    public boolean isThree(int n) {
        int count = 1;
        int m = n / 2;
        for(int i = 1; i <= m; i++){
            if(n % i == 0){
                count++;
            }
            if(count > 3){
                return false;
            }
        }
        if(count == 3){
            return true;
        }
        return false;
        
    }
}