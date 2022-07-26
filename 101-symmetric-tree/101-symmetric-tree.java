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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList(); 
        List<Integer> list = new ArrayList(); 
        
        if(root != null)
            queue.add(root);
        
        while(!queue.isEmpty()){
            int length = queue.size(); 
            list.clear(); 
            
            for(int i = 0; i < length; i++){
                TreeNode current = queue.poll();
                
                if(current.left != null){
                    queue.add(current.left); 
                    list.add(current.left.val); 
                } else{
                    list.add(null);
                }
                
                if(current.right != null){
                    queue.add(current.right);
                    list.add(current.right.val);
                } else {
                    list.add(null);
                }
            }
            
            int left = 0; 
            int right = list.size()-1; 
            
            while(left < right){
                if(list.get(left++) != list.get(right--))
                    return false; 
            }
        }
        
        return true; 
    }
}