class Solution {
    public int minInsertions(String s) {
        int count = 0;
        int open = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='('){
                open++;
            }
            else{
                if(i<s.length()-1 && s.charAt(i+1)==')'){
                    i++;
                }
                else{
                    count++;
                }
                if(open>0){
                    open--;
                }
                else{
                    count++;
                }

            }
        }
        return count + open*2;
    }
}