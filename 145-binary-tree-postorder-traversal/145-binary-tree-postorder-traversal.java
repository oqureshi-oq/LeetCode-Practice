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
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> list = new LinkedList(); 
        Deque<TreeNode> stack = new ArrayDeque(); 
        
        if(root != null)
            stack.push(root);
        
        while(stack.size() > 0){
            TreeNode current = stack.pop(); 
            list.addFirst(current.val);
            if(current.left != null)
                stack.push(current.left);
            if(current.right != null)
                stack.push(current.right); 
        }
        
        return list; 
    }
}