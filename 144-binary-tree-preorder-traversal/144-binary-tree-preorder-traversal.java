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
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList(); 
        Deque<TreeNode> stack = new ArrayDeque(); 
        
        if(root != null)
            stack.push(root);
        
        while(!stack.isEmpty()){
            TreeNode node = stack.pop(); 
            list.add(node.val);
            if(node.right != null)
                stack.push(node.right);
            if(node.left != null)
                stack.push(node.left);
        }
        
        return list; 
    }
    // public List<Integer> preorderTraversal(TreeNode root) {
    //     List<Integer> list = new ArrayList(); 
    //     preorderTraversal(root, list);
    //     return list; 
    // }
    
    // public void preorderTraversal(TreeNode node, List<Integer> list){
    //     if(node == null)
    //         return; 
    //     list.add(node.val);
    //     preorderTraversal(node.left, list);
    //     preorderTraversal(node.right, list);
    // }
}