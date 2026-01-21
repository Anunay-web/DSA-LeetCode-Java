# LeetCode DSA – Java Solutions 🚀

This repository contains my **LeetCode solutions in Java**, with clean logic and optimized approaches.

---

## 📘 Problem: Wiggle Sort  
**LeetCode #280**

---

## 🔍 Problem Statement
Given an integer array `nums`, rearrange it so that:


This pattern is called a **wiggle sequence**.

---

## 💡 Approach (Simple One-Pass)

We traverse the array once and ensure:
- At **odd indices**, the element is **greater than or equal to** the previous element
- At **even indices**, the element is **less than or equal to** the previous element

If the condition is violated, we **swap the two elements**.

---

## ✅ Java Solution

```java
class Solution {
    public void wiggleSort(int[] nums) {

        for (int i = 1; i < nums.length; i++) {

            // odd index: nums[i] >= nums[i - 1]
            if (i % 2 == 1 && nums[i] < nums[i - 1]) {
                swap(nums, i, i - 1);
            }

            // even index: nums[i] <= nums[i - 1]
            if (i % 2 == 0 && nums[i] > nums[i - 1]) {
                swap(nums, i, i - 1);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
