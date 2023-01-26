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
    List<TreeNode> list; 
    
    public TreeNode increasingBST(TreeNode root) {
        list = new ArrayList();
        
        inorderTraversal(root);
        
        root = null;
        TreeNode prev = null; 
        
        for(TreeNode current: list){
            if(root == null)
                root = current; 
            
            current.left = null; 
            if(prev != null)
                prev.right = current; 
            prev = current; 
        }
        
        return root; 
    }
    
    public void inorderTraversal(TreeNode node){
        if(node == null)
             return;
        
        inorderTraversal(node.left);
        list.add(node);
        inorderTraversal(node.right);
    }
}