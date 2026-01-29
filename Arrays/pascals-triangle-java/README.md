# Pascal's Triangle – Java

## 📌 Problem
Given an integer `numRows`, generate the first `numRows` of Pascal's Triangle.

Pascal's Triangle is built such that:
- Each row starts and ends with `1`
- Each middle element is the sum of the two elements directly above it

---

## 💡 Approach
- Use a `List<List<Integer>>` to store all rows
- Each row is built using values from the previous row
- Time Complexity: **O(n²)**
- Space Complexity: **O(n²)**

---

## 🧠 Algorithm
1. Initialize an empty result list
2. Loop from `0` to `numRows - 1`
3. Add `1` at the start of every row
4. Compute middle values using the previous row
5. Add `1` at the end (if row index > 0)

---

## 💻 Java Solution

```java
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int j = 1; j < i; j++) {
                int val = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                row.add(val);
            }

            if (i > 0) {
                row.add(1);
            }
            result.add(row);
        }
        return result;
    }
}
