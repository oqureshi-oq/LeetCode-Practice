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
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode current = root; 
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        List<Integer> list = new ArrayList(); 
        
        while(current != null || stack.size() > 0){
            if(current == null){
                current = stack.pop(); 
                list.add(current.val);
                current = current.right; 
            }
            
            while(current != null){
                stack.push(current);
                current = current.left; 
            }
            
            if(current != null)
                list.add(current.val);
            
            current = null; 
        }
        
        return list; 
    }
}