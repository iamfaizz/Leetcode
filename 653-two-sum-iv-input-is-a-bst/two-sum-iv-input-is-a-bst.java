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
    public boolean findTarget(TreeNode root, int k) {
        Stack<TreeNode> asc=new Stack<>();
        Stack<TreeNode> desc=new Stack<>();

        TreeNode curr=root;
        while(curr!=null){
            asc.push(curr);
            curr=curr.left;
        }

        curr=root;
        while(curr!=null){
            desc.push(curr);
            curr=curr.right;
        }

        TreeNode small=getSmall(asc);
        TreeNode big=getBig(desc);

        while(small!=null && big!=null && small!=big){
            int sum=small.val+big.val;

            if(sum==k){
                return true;
            }else if(sum<k){
                small=getSmall(asc);
            }else{
                big=getBig(desc);
            }
        }
        return false;
    }

    private TreeNode getSmall(Stack<TreeNode> asc){

        if(asc.isEmpty()){
            return null;
        }

        TreeNode small=asc.pop();
        TreeNode rightChild=small.right;

        while(rightChild!=null){
            asc.push(rightChild);
            rightChild=rightChild.left;
        }
        return small;
    }

    private TreeNode getBig(Stack<TreeNode> desc){

        if(desc.isEmpty()){
            return null;
        }

        TreeNode big=desc.pop();
        TreeNode leftChild=big.left;

        while(leftChild!=null){
            desc.push(leftChild);
            leftChild=leftChild.right;
        }
        return big;
    }

    
}