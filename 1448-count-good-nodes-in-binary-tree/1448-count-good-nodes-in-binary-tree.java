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
    int max; 
    int count; 
    
    public int goodNodes(TreeNode root) {
        if(root == null)
            return 0;
        
        max = root.val;
        goodNodesHelper(root);
        return count; 
    }
    
    public void goodNodesHelper(TreeNode node){
        if(node == null)
            return;
        int temp = max; 
        
        if(node.val >= max){
            count++;
            max = node.val; 
        }
        goodNodesHelper(node.left);
        goodNodesHelper(node.right);
        max = temp; 
    }
}