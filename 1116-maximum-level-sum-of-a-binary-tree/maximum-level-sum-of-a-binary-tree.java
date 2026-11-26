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
    public int maxLevelSum(TreeNode root) {
        int ms = Integer.MIN_VALUE;
        int ans = 1;
        int level = 0;
        int sum = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            if(cur == null){
                if(q.isEmpty())break;
                level++;
                if(sum > ms){
                    ans = level;
                    ms = sum;
                }
                sum = 0;
                q.offer(null);
            }
            else{
                sum += cur.val;
                if(cur.left != null)q.offer(cur.left);
                if(cur.right != null)q.offer(cur.right);
            }
        }
        if(sum > ms){
            ans = level + 1;
        }
        return ans;
    }
}