# Minimize Maximum Pair Sum in Array

## 📌 Problem
Given an integer array `nums` of even length, pair the elements such that the **maximum pair sum is minimized**.

🔗 LeetCode Problem: 1877 – Minimize Maximum Pair Sum in Array

---

## 💡 Approach (Greedy)
1. Sort the array
2. Pair smallest element with largest element
3. Track the maximum pair sum
4. Return the maximum value obtained

This greedy approach ensures the minimum possible maximum sum.

---

## ✅ Example
Input:
nums = [3,5,2,3]


Sorted:
[2,3,3,5]


Pairs:
- (2,5) → 7  
- (3,3) → 6  

Output:
7


---

## ⏱ Complexity
- **Time Complexity:** `O(n log n)`
- **Space Complexity:** `O(1)` (excluding sorting)

---

## 🧠 Key Learning
- Greedy strategy
- Two pointer technique
- Pairing optimization

---
