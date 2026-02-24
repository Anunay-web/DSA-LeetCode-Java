/**
 * LeetCode 2326 - Spiral Matrix IV
 *
 * Problem:
 * Given two integers m and n, and the head of a linked list,
 * return an m x n matrix filled in spiral order using the
 * linked list values.
 *
 * If the linked list runs out of values,
 * fill remaining cells with -1.
 *
 * Approach:
 * - Initialize matrix with -1
 * - Use boundary traversal (top, bottom, left, right)
 * - Fill matrix in spiral order directly
 *
 * Time Complexity: O(m * n)
 * Space Complexity: O(1) (excluding output matrix)
 */

class Solution {

    public int[][] spiralMatrix(int m, int n, ListNode head) {

        int[][] matrix = new int[m][n];

        // Step 1: Fill matrix with -1
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = -1;
            }
        }

        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        ListNode current = head;

        // Step 2: Spiral Filling
        while (current != null && top <= bottom && left <= right) {

            // Left → Right
            for (int j = left; j <= right && current != null; j++) {
                matrix[top][j] = current.val;
                current = current.next;
            }
            top++;

            // Top → Bottom
            for (int i = top; i <= bottom && current != null; i++) {
                matrix[i][right] = current.val;
                current = current.next;
            }
            right--;

            // Right → Left
            for (int j = right; j >= left && current != null; j--) {
                matrix[bottom][j] = current.val;
                current = current.next;
            }
            bottom--;

            // Bottom → Top
            for (int i = bottom; i >= top && current != null; i--) {
                matrix[i][left] = current.val;
                current = current.next;
            }
            left++;
        }

        return matrix;
    }
}
