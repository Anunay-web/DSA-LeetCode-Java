class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length;
        while(low <= high){
            int mid = (low + high) / 2;
            int peak = arr[mid];
            int left = mid > 0 ? arr[mid - 1] : -1;
            int right = mid < arr.length - 1 ? arr[mid + 1] : -1;
            if(peak > left && peak > right){
                return mid;
            }
            else if(peak < left){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;

    }
}