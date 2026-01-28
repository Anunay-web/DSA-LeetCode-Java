# LeetCode 77 – Combinations

## 🔍 Problem Statement
Given two integers `n` and `k`, return all possible combinations of `k` numbers chosen from the range `[1, n]`.

---

## 🧠 Approach: Backtracking

We build combinations step-by-step:
- Start from a number
- Choose it
- Recurse to choose the next number
- Backtrack after exploring the path

This avoids duplicate combinations and ensures increasing order.

---

## ✅ Algorithm
1. Start from number `1`
2. Add current number to the list
3. Recursively call for next number
4. If size reaches `k`, store the combination
5. Backtrack to explore other paths

---

## ⏱️ Time Complexity
- **O(C(n, k))** — total combinations

## 📦 Space Complexity
- **O(k)** — recursion stack

---

## 🧩 Java Implementation

```java
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int n, int k,
                           List<Integer> current,
                           List<List<Integer>> result) {

        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i <= n; i++) {
            current.add(i);
            backtrack(i + 1, n, k, current, result);
            current.remove(current.size() - 1);
        }
    }
}
