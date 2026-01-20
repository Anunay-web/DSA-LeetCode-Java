# LeetCode DSA – Java Solutions 🚀

This repository contains my **LeetCode solutions in Java**, written with clean logic and optimized approaches.

---

## 📘 Problem: Maximum Ice Cream Bars  
**LeetCode #1833**

---

### 🔍 Problem Statement
You are given an array `costs` where `costs[i]` is the cost of the `i-th` ice cream bar, and an integer `coins` representing the number of coins you have.

Return the **maximum number of ice cream bars** you can buy if you can buy the ice cream bars at most once.

---

### 💡 Approach (Greedy)
- To maximize the number of ice creams, always buy the **cheapest ice cream first**
- Sort the `costs` array
- Keep buying until coins are insufficient

---

### ✅ Java Solution

```java
import java.util.Arrays;

class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);

        int sum = 0;
        int count = 0;

        for (int cost : costs) {
            if (sum + cost <= coins) {
                sum += cost;
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
