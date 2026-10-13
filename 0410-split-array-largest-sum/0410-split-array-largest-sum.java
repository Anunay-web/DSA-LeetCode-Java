class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0, high = 0;

        for (int n : nums) {
            low = Math.max(low, n);
            high += n;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (calc(mid, nums) > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public int calc(int capacity, int[] nums) {
        int subarrays = 1;
        int sum = 0;

        for (int n : nums) {
            if (sum + n > capacity) {
                subarrays++;
                sum = n;
            } else {
                sum += n;
            }
        }

        return subarrays;
    }
}