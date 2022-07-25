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
        List<Integer> list = new ArrayList(); 
        Deque<TreeNode> stack = new ArrayDeque(); 
        TreeNode current = root; 
        
        while(current != null || !stack.isEmpty()){
            while(current != null){
                stack.push(current);
                current = current.left; 
            }
            
            current = stack.pop();
            list.add(current.val);
            current = current.right; 
        }
        
        return list; 
    }
    
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> list = new ArrayList(); 
//         inorderTraversal(root, list);
//         return list; 
//     }
    
//     public void inorderTraversal(TreeNode node, List<Integer> list){
//         if(node == null)
//             return;
//         inorderTraversal(node.left, list);
//         list.add(node.val);
//         inorderTraversal(node.right, list);
//     }
}