# Permutations (LeetCode 46)

## 🔹 Problem
Given an array of distinct integers `nums`, return all possible permutations.

---

## 🔹 Approach (Backtracking)

- Use a `visited[]` array to track used elements
- Build permutations step-by-step
- When current list size equals array length, store the result
- Backtrack by removing last element and unmarking visited

---

## 🔹 Algorithm
1. Start with an empty list
2. Try each unused number
3. Mark it visited and recurse
4. Backtrack after recursion

---

## 🔹 Time & Space Complexity
- **Time:** `O(n! × n)`
- **Space:** `O(n)`

---

## 🔹 Example
**Input:** `[1,2,3]`  
**Output:**  
[1,2,3]
[1,3,2]
[2,1,3]
[2,3,1]
[3,1,2]
[3,2,1]


---

## 🔹 Concepts Used
- Backtracking
- Recursion
- Boolean visited array
