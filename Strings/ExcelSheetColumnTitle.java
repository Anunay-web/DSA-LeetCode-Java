# Excel Sheet Column Title – Java 🚀

This repository contains a Java solution for  
**LeetCode 168 – Excel Sheet Column Title**.

---

## 📘 Problem Statement

Given an integer `columnNumber`, return its corresponding column title as it appears in an Excel sheet.

### Examples
1 → A
26 → Z
27 → AA
28 → AB


---

## 💡 Approach

This problem is a variation of **base-26 conversion**, but with a twist:

- There is **no zero**
- Characters range from `A` to `Z`
- So we **decrement `columnNumber` before modulo**

### Steps:
1. Decrement `columnNumber` by 1
2. Find remainder using `% 26`
3. Convert remainder to a character
4. Divide by 26 and repeat
5. Reverse the result

---

## ✅ Java Solution

```java
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;                 // adjust for 1-based indexing
            int x = columnNumber % 26;
            sb.append((char) ('A' + x));
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}
