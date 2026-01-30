# N-Queens Problem (Backtracking)

## Problem
Place `n` queens on an `n x n` chessboard such that no two queens attack each other.

## Approach
- Use **Backtracking**
- Place one queen per row
- Check safety only in:
  - Same column
  - Upper-left diagonal
  - Upper-right diagonal
- Backtrack after exploring each path

## Time Complexity
- **O(N!)**

## Space Complexity
- **O(N²)** for chessboard + recursion stack

## Example (n = 4)
.Q.. <br>
...Q <br>
Q... <br>
..Q.


## Language
- Java

## LeetCode
- Problem 51: N-Queens
