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
    public boolean isValid(TreeNode root, int val){
        if(root == null) return true;
        if(root.val != val) return false;
        if(!isValid(root.left, val) || !isValid(root.right, val)) return false;
        return true;
    }
    public boolean isUnivalTree(TreeNode root) {
        int val = root.val;
        return isValid(root, val);
    }
}