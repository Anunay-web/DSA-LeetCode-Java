class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count = 0;
        int j = 1;
        int i = 0;
        while(i < arr.length){
            if(j != arr[i]){
                count++;
                if(count == k){
                    return j;
                }
                j++;
                continue;
            }
            i++;
            j++;
        }
        while(count < k){
            j++;
            count++;
        }
        return j - 1;
    }
}