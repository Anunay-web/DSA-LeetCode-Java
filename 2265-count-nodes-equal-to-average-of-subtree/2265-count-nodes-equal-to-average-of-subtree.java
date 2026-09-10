/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int total = 0;
    int size = 0;
    int count = 0;
    public int averageOfSubtree(TreeNode root) {
        averageCheck(root);
        return count;


    }
    public void total(TreeNode root){
        if(root == null){
            return;
        }
        total += root.val;
        total(root.left);
        total(root.right);
        size++;
    }
    public void averageCheck(TreeNode root){
        if(root == null){
            return;
        }
        total(root);
        if((total / size) == root.val){
            count++;
        }
        total = 0;
        size = 0;
        averageCheck(root.left);
        averageCheck(root.right);
    }
}