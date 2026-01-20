# LeetCode DSA – Java Solutions 🚀

This repository contains my **LeetCode solutions in Java**, written with clean logic and optimized approaches.

---

## 📘 Problem: H-Index  
**LeetCode #274**

---

### 🔍 Problem Statement
Given an integer array `citations`, where `citations[i]` is the number of citations a researcher received for their `i-th` paper, return the researcher's **H-index**.

The H-index is defined as the maximum value `h` such that the researcher has **at least `h` papers** with **at least `h` citations each**.

---

### 💡 Approach (Sorting)
1. Sort the citations array in ascending order
2. For each index `i`:
   - Number of papers with at least `citations[i]` citations = `n - i`
3. If `citations[i] >= n - i`, then `h = n - i`
4. Return the maximum such `h`

---

### ✅ Java Solution

```java
import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;

        for (int i = 0; i < n; i++) {
            int h = n - i;
            if (citations[i] >= h) {
                return h;
            }
        }
        return 0;
    }
}
