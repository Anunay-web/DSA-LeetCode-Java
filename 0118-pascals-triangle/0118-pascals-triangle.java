class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ls = new ArrayList<>();
        for(int i = 1; i <= numRows; i++){
            ls.add(gen(i));
        }
        return ls;

        
    }
    public static ArrayList<Integer> gen(int row){
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(1);
        int ans = 1;
        for(int col = 1; col < row; col++){
            ans = ans * (row - col);
            ans = ans/col;
            ls.add(ans);

        }
        return ls;
    }
}