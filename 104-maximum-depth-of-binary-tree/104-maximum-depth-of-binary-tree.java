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
    public int maxDepth(TreeNode root) {
        int max = 0; 
        Queue<TreeNode> queue = new LinkedList(); 
        
        if(root != null)
            queue.add(root);
        
        while(!queue.isEmpty()){
            max++; 
            int length = queue.size(); 
            
            for(int i = 0; i < length; i++){
                TreeNode current = queue.poll(); 
                if(current.left != null)
                    queue.add(current.left);
                if(current.right != null)
                    queue.add(current.right);
            }
        }
        
        return max; 
    }
    
    // public int maxDepth(TreeNode root) {
    //     if(root == null) return 0; 
    //     return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1; 
    // }
}