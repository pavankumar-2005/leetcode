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
    private int diam = 0;
    public int solve(TreeNode root){
        if(root == null) return 0;
        int lh = solve(root.left);
        int rh = solve(root.right);
        diam = Math.max(diam, lh + rh);
        return Math.max(lh,rh) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        solve(root);
        return diam;
    }
}