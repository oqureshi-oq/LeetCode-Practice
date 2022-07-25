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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList(); 
        Queue<TreeNode> queue = new LinkedList(); 
        
        if(root != null)
            queue.add(root); 
        
        while(!queue.isEmpty()){
            int length = queue.size(); 
            List<Integer> level = new ArrayList(); 
            
            for(int i = 0; i < length; i++){
                TreeNode node = queue.poll();
                level.add(node.val);
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right); 
            }
            
            list.add(level); 
        }
        
        return list; 
    }
}