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
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return false;
        }
        return result(root.left, root.right);
    }

    public boolean result(TreeNode left, TreeNode right){
        if(left==null && right==null){
            return true;
        }
        if(left==null || right==null){
            return false;
        }
        if(left.val!=right.val){
            return false;
        }

        boolean r1=result(left.left, right.right);
        boolean r2=result(left.right, right.left);

        if(r1==true && r2==true){
            return true;
        }
        return false;
    }
}