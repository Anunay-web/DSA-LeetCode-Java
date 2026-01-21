# LeetCode DSA – Java Solutions 🚀

This repository contains my **LeetCode solutions in Java**, written with clear logic and optimal approaches.

---

## 📘 Problem: Maximum Sum Circular Subarray  
**LeetCode #918**

---

## 🔍 Problem Statement
Given a **circular integer array** `nums`, return the **maximum possible sum of a non-empty subarray**.

A circular array means the **end of the array connects to the beginning**.

---

## 💡 Approach (Intuition First)

There are **two possible cases** for the maximum subarray sum:

### 1️⃣ Normal (Non-Circular Subarray)
- The subarray lies completely inside the array
- Use **Kadane’s Algorithm** to find the maximum subarray sum  
  → call it `maxSubarray`

---

### 2️⃣ Circular (Wrap-Around Subarray)
- The subarray wraps from the end to the beginning
- Instead of finding it directly:
  - Find the **minimum subarray sum**
  - Subtract it from the **total array sum**


👉 Removing the **worst part** gives the **best circular sum**.

---

### ⚠️ Important Edge Case
If **all numbers are negative**:
- `totalSum − minSubarray` becomes `0` (invalid)
- The answer should be the **maximum element**

So:

---

## ✅ Java Solution

```java
class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int totalSum = 0;
        int maxSum = nums[0];
        int minSum = nums[0];

        int currMax = 0;
        int currMin = 0;

        for (int num : nums) {
            totalSum += num;

            // Kadane for maximum subarray
            currMax = Math.max(num, currMax + num);
            maxSum = Math.max(maxSum, currMax);

            // Kadane for minimum subarray
            currMin = Math.min(num, currMin + num);
            minSum = Math.min(minSum, currMin);
        }

        // all elements are negative
        if (maxSum < 0) {
            return maxSum;
        }

        return Math.max(maxSum, totalSum - minSum);
    }
}
