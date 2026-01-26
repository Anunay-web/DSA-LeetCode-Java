# Combination Sum (Backtracking)

## Problem
Given an array of distinct integers `candidates` and a target value,
return all unique combinations where the chosen numbers sum to target.

Each number may be used **multiple times**.

---

## Example
Input:
candidates = [2,3,6,7], target = 7

Output:
[[2,2,3], [7]]

---

## Approach
- Use backtracking to explore all possible combinations
- Reuse elements by passing the same index in recursion
- Stop recursion when target becomes negative

---

## Key Insight
Choose → Explore → Un-choose

---

## Complexity
- Time: O(2^n)
- Space: O(n)
