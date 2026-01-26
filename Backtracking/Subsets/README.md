# Subsets (Power Set) – Backtracking

## Problem
Given an integer array, generate all possible subsets.

Example:
Input: [1,2,3]
Output:
[[], [1], [1,2], [1,2,3], [1,3], [2], [2,3], [3]]

---

## Approach
We use backtracking.
At each recursive call:
1. Add the current subset
2. Try adding remaining elements
3. Backtrack after recursion

---

## Key Insight
Choose → Explore → Un-choose

---

## Complexity
Time: O(2^n)  
Space: O(n)
