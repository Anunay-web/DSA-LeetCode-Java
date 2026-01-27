# Permutations II (LeetCode 47)

## 🔹 Problem
Given a collection of numbers that might contain duplicates, return all possible **unique permutations**.

---

## 🔹 Approach (Backtracking + Pruning)

- Sort the array so duplicates are adjacent
- Use a `visited[]` array to track used elements
- Skip duplicate elements if the previous duplicate has not been used
- This prevents generating duplicate permutations

---

## 🔹 Duplicate Skip Logic
```java
if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue;
🔹 Time & Space Complexity
Time: O(n! × n)

Space: O(n) (recursion + visited array)

🔹 Example
Input: [1,1,2]
Output:

[1,1,2]
[1,2,1]
[2,1,1]
🔹 Concepts Used
Backtracking

Recursion

Sorting

Pruning duplicate states
