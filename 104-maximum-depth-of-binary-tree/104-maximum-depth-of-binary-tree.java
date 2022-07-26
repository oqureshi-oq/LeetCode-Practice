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
    public int maxDepth(TreeNode root){
        Deque<TreeNode> stack = new ArrayDeque(); 
        Deque<Integer> depths = new ArrayDeque(); 
        int max = 0; 
    
        if(root != null){
            stack.push(root);
            depths.push(1); 
            max = 1; 
        }
        
        while(!stack.isEmpty()){
            TreeNode current = stack.pop(); 
            int currentDepth = depths.pop(); 
            max = Math.max(currentDepth, max); 
            
            if(current.right != null){
                stack.push(current.right);
                depths.push(currentDepth+1); 
            }
            
            if(current.left != null){
                stack.push(current.left);
                depths.push(currentDepth+1); 
            }
        }
        
        return max; 
    }
    
//     public int maxDepth(TreeNode root){
//         Deque<TreeNode> stack = new ArrayDeque(); 
//         TreeNode current = root; 
//         TreeNode prev = null; 
//         int max = 0;  
        
//         while(current != null || !stack.isEmpty()){
//             while(current != null){
//                 stack.push(current);
//                 prev = current; 
//                 current = current.left; 
//                 max = Math.max(max, stack.size()); 
//             }
            
//             if(stack.peek().right != null && stack.peek().right != prev){
//                 prev = current; 
//                 current = stack.peek().right;
//             } else { 
//                 prev = stack.pop();
//                 System.out.println(prev.val); 
//             }
//         }
        
//         return max; 
//     }
    
//     public int maxDepth(TreeNode root) {
//         int max = 0; 
//         Queue<TreeNode> queue = new LinkedList(); 
        
//         if(root != null)
//             queue.add(root);
        
//         while(!queue.isEmpty()){
//             max++; 
//             int length = queue.size(); 
            
//             for(int i = 0; i < length; i++){
//                 TreeNode current = queue.poll(); 
//                 if(current.left != null)
//                     queue.add(current.left);
//                 if(current.right != null)
//                     queue.add(current.right);
//             }
//         }
        
//         return max; 
//     }
    
    // public int maxDepth(TreeNode root) {
    //     if(root == null) return 0; 
    //     return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1; 
    // }
}