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
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> ls = new ArrayList<>();
        inorder(root, ls);
        TreeNode res = new TreeNode(ls.get(0));
        int i = 1;
        create(ls, res, i);
        return res;
        
    }

    public static void create(ArrayList<Integer> ls, TreeNode res, int i){
        if(i == ls.size()){
            return;
        }
        res.right = new TreeNode(ls.get(i));
        i++;
        create(ls, res.right, i);

    }

    public static void inorder(TreeNode root, ArrayList<Integer> ls){
        if(root == null){
            return;
        }
        inorder(root.left, ls);
        ls.add(root.val);
        inorder(root.right, ls);
    }
}