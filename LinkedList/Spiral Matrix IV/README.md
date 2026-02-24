# 🔄 Spiral Matrix IV

### 🟡 Difficulty: Medium  
### 🏷️ Tags: Matrix, Linked List, Simulation  
### 🔗 Platform: LeetCode (2326)

---

## 📌 Problem Statement

Given integers `m` and `n`, and the head of a linked list,  
return an `m x n` matrix filled in spiral order using the linked list values.

If the linked list runs out of values, fill the remaining cells with `-1`.

---

## 💡 Approach

1. Initialize the matrix with `-1`.
2. Maintain four boundaries:
   - `top`
   - `bottom`
   - `left`
   - `right`
3. Traverse in spiral order:
   - Left → Right
   - Top → Bottom
   - Right → Left
   - Bottom → Top
4. Continue until the linked list is exhausted.

---

## ⏱ Complexity

- **Time Complexity:** O(m × n)
- **Space Complexity:** O(1) (excluding output matrix)

---

## 🧠 Key Learning

- Boundary traversal pattern
- Spiral matrix simulation
- Linked list traversal with matrix filling
