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
    public int func(TreeNode root)
    {
        if(root == null){
            return 1;
        }
        int lh = func(root.left);
        int rh = func(root.right);

        if(lh == -1 || rh == -1) return -1;
        if(Math.abs(lh - rh) > 1) return -1;
        return 1 + Math.max(lh, rh);
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        return func(root) != -1;
    }
}
