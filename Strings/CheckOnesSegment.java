
---

## 📘 Problem: Check if Binary String Has at Most One Segment of Ones
**LeetCode #1784**

### 🔍 Problem Summary
Given a binary string `s`, return `true` if it contains **at most one segment of consecutive `1`s**, otherwise return `false`.

---

### 💡 Approach
- A new segment of `1`s starts when `"01"` appears
- If `"01"` exists → more than one segment → return `false`
- Otherwise → return `true`

---

### ✅ Java Solution
```java
class Solution {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}
