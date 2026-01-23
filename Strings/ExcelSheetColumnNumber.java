# Excel Sheet Column Number – Java 🚀

This repository contains a Java solution for  
**LeetCode 171 – Excel Sheet Column Number**.

---

## 📘 Problem Statement

Given a string `columnTitle` that represents the column title as it appears in an Excel sheet, return its corresponding **column number**.

### Examples
  A → 1
Z → 26
AA → 27
AB → 28

---

## 💡 Approach

This problem is similar to **base-26 number conversion**:

- Each character represents a digit
- `A = 1`, `B = 2`, ..., `Z = 26`
- For each character:
result = result * 26 + currentValue
  
---

## ✅ Java Solution

```java
class Solution {
  public int titleToNumber(String columnTitle) {
      int result = 0;
      for (int i = 0; i < columnTitle.length(); i++) {
          int val = columnTitle.charAt(i) - 'A' + 1;
          result = result * 26 + val;
      }
      return result;
  }
}

