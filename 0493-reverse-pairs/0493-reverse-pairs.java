class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public int mergeSort(int[] nums, int low, int high) {
        int cnt = 0;
        if (low < high) {
            int mid = low + (high - low) / 2;

            cnt += mergeSort(nums, low, mid);
            cnt += mergeSort(nums, mid + 1, high);

            int left = low;
            int right = mid + 1;
            while (left <= mid && right <= high) {
                if ((long) nums[left] > 2L * nums[right]) {
                    cnt += mid - left + 1;
                    right++;
                } else {
                    left++;
                }
            }
            merge(nums, low, mid, high);
        }
        return cnt;
    }

    public void merge(int[] nums, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            } else {
                temp.add(nums[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(nums[left]);
            left++;
        }

        while (right <= high) {
            temp.add(nums[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }
    }
}