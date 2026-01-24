# Maximum Gap (LeetCode 164)

## 📌 Problem Statement
Given an integer array `nums`, return the maximum difference between two successive elements in its sorted form.  
If the array contains less than two elements, return `0`.

---

## 🧠 Approach 1: Sorting (Implemented)

### Steps:
1. If array length < 2, return 0
2. Sort the array
3. Compute the maximum difference between adjacent elements

### Code Logic:
- Sorting ensures adjacent elements give meaningful gaps
- Maximum gap will always lie between consecutive sorted elements

---

## ⏱ Complexity Analysis
- **Time Complexity:** `O(n log n)`
- **Space Complexity:** `O(1)` (ignoring sorting internals)

---

## ⚠️ Interview Note
Although this solution is correct and clean, the problem asks for a **linear time solution**.  
The optimal approach uses the **Bucket Sort / Pigeonhole Principle**, which can be implemented in `O(n)` time.

---

## ✅ Status
✔ Accepted on LeetCode  
✔ Suitable for coding rounds  
✔ Interview-safe when optimization is discussed

---

## 🔗 Problem Link
LeetCode 164 – Maximum Gap
