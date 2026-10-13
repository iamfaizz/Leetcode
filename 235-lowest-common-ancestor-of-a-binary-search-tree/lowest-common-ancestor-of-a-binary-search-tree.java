/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

           if(p.val>q.val){
        return result(root,q,p);
    }else{
        return result(root,p,q);
    }

    }

    private TreeNode result(TreeNode root, TreeNode p, TreeNode q){



        if(root==null){
            return null;
        }
        if(root==p || root==q){
            return root;
        }

        if(root.val<p.val){
            return result(root.right,p,q);
        }else if(root.val>q.val){
            return result(root.left,p,q);
        }else{
            return root;
        }
        
    }
}