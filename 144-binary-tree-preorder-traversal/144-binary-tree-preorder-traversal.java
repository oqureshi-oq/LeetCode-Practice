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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList(); 
        
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        if(root != null)
            stack.push(root); 
        
        while(stack.size() > 0){
            TreeNode node = stack.pop(); 
            list.add(node.val);
            if(node.right != null)
                stack.push(node.right);
            if(node.left != null)
                stack.push(node.left); 
        }
        
        return list; 
    }
}