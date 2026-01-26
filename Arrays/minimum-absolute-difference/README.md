# Minimum Absolute Difference (LeetCode)

## 🧠 Problem Statement
Given an array of distinct integers `arr`, find all pairs of elements with the **minimum absolute difference** between any two elements.

Return the pairs in ascending order.

---

## 🚀 Approach
1. Sort the array.
2. Find the minimum absolute difference between consecutive elements.
3. Traverse again and collect all pairs that match the minimum difference.

---

## ✅ Example
**Input**
arr = [4,2,1,3]


**Output**
[[1,2],[2,3],[3,4]]


---

## ⏱ Time & Space Complexity
- **Time Complexity:** `O(n log n)` (due to sorting)
- **Space Complexity:** `O(1)` (excluding output list)

---

## 💻 Tech Stack
- Java
- Arrays
- ArrayList

---
