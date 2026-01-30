class Solution {
    ArrayList<List<String>> result = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] chessboard = new char[n][n];
        for(int i=0 ; i<n ;i++){
            Arrays.fill(chessboard[i], '.');
        }
        backtrack(chessboard,0,n);
        return result;
        
    }
    private void backtrack(char[][] chessboard, int row, int n){
        if(row==n){
            result.add(constructBoard(chessboard));
            return;
        }
        for(int j=0; j<n; j++){
        if(isSafe(chessboard, row, j, n)){
            chessboard[row][j] = 'Q';
            backtrack(chessboard,row+1,n);
            chessboard[row][j] = '.'; //backtrack
            }
        }
    }
    private static boolean isSafe(char[][] chessboard, int row, int col, int n){
        //Vertically Up
        for(int i=row-1; i>=0; i--){
            if(chessboard[i][col] == 'Q'){
                return false;
            }
        }
        //Left Diaganol
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(chessboard[i][j] == 'Q'){
                return false;
            }
        }
        //Right Diagnol
        for(int i=row-1,j=col+1; i>=0 && j<n; i--, j++){
            if(chessboard[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
     
     private List<String> constructBoard(char[][] board) {
        List<String> path = new ArrayList<>();
        for (char[] row : board) {
            path.add(new String(row));
        }
        return path;
    }

}
