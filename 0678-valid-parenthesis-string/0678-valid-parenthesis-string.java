class Solution {
    public boolean checkValidString(String s) {
        int max = 0;
        int min = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                max++;
                min++;
            }
            else if(ch == ')'){
                max--;
                min--;
            }
            else{
                max++;
                min--;
            }
            min = Math.max(0, min);
            if(max < 0){
                return false;
            }
        }
        return min == 0;
        
    }
}