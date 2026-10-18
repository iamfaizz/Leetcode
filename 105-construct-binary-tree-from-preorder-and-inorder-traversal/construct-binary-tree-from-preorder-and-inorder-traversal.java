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
    int ind=0;
    Map<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
       
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return result(preorder,0,inorder.length-1);
    }

    private TreeNode result(int[] preorder, int low, int high){

        if(low>high){
            return null;
        }
        TreeNode node=new TreeNode(preorder[ind]);
        ind++;
        int id=map.get(node.val);
        node.left=result(preorder,low,id-1);
        node.right=result(preorder,id+1,high);

        return node;
    }
}