class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(1);
        long ans = 1;
        for(int col = 1; col <= rowIndex; col++){
            ans = ans * (rowIndex - col + 1);
            ans = ans/col;
            ls.add((int)ans);

        }
        return ls;
    }
        
}