class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[] res = new int[seq.length()];
        int d = 0;
        for(int i = 0; i < seq.length(); i++){
            char ch = seq.charAt(i);
            if(ch == '('){
                d++;
                res[i] = d % 2;

            }
            else{
                res[i] = d % 2;
                d--;
            }
        }
        return res;
        
    }
}