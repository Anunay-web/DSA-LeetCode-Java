class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        int strow = 0;
        int stcol = 0;
        int ltrow = matrix.length - 1;
        int ltcol = matrix[0].length - 1;
        while(strow <= ltrow && stcol <= ltcol){
            for(int i = stcol; i <= ltcol; i++){
                res.add(matrix[strow][i]);
            }
            for(int i = strow + 1; i <= ltrow; i++){
                res.add(matrix[i][ltcol]);
            }
            for(int i = ltcol - 1; i >= stcol; i--){
                if(strow == ltrow){
                    break;
                }
                res.add(matrix[ltrow][i]);
            }
            for(int i = ltrow - 1; i >= strow + 1; i--){
                if(stcol == ltcol){
                    break;
                }
                res.add(matrix[i][stcol]);
            }
            strow++;
            stcol++;
            ltrow--;
            ltcol--;
        }
        return res;
        
    }
}