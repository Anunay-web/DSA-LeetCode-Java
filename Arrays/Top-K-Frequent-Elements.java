# Top K Frequent Elements – Java (Arrays Only)

This repository contains a Java solution for **LeetCode 347 – Top K Frequent Elements**  
implemented using **only arrays and sorting**, without using HashMap or PriorityQueue.

---

## 📘 Problem Statement

Given an integer array `nums` and an integer `k`, return the `k` most frequent elements.

You may return the answer in **any order**.

---

## 💡 Approach (Arrays Only)

1. Sort the array so that identical elements are grouped together
2. Count frequencies of each unique element
3. Store:
   - unique values in one array
   - their frequencies in another array
4. Repeatedly pick the element with the highest frequency `k` times

This approach avoids using HashMap or Heap.

---

## ✅ Java Solution

```java
import java.util.Arrays;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Arrays.sort(nums);

        int n = nums.length;

        int[] values = new int[n];
        int[] freq = new int[n];

        int size = 0;
        int count = 1;

        for (int i = 1; i <= n; i++) {
            if (i < n && nums[i] == nums[i - 1]) {
                count++;
            } else {
                values[size] = nums[i - 1];
                freq[size] = count;
                size++;
                count = 1;
            }
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            int maxIdx = 0;
            for (int j = 1; j < size; j++) {
                if (freq[j] > freq[maxIdx]) {
                    maxIdx = j;
                }
            }
            result[i] = values[maxIdx];
            freq[maxIdx] = -1; // mark as used
        }

        return result;
    }
}
