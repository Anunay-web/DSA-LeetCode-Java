class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int low = 0;
        int high = mat[0].length - 1;
        while(low <= high){
            int mid = (high + low) / 2;
            int row = maxR(mat, mid);
            int left = mid - 1 >= 0 ? mat[row][mid - 1] : -1;
            int right = mid + 1 < n ? mat[row][mid + 1] : -1;
            if(mat[row][mid] > left && mat[row][mid] > right){
                return new int[] {row, mid};
            }
            else if(mat[row][mid] < left){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return new int[] { -1, -1 };
    }
    public static int maxR(int[][] mat, int mid){
        int maxVal = -1;
        int index = -1;
        for(int i = 0; i < mat.length; i++){
            if(mat[i][mid] > maxVal){
                maxVal = mat[i][mid];
                index = i;
            }
        }
        return index;

    }
}