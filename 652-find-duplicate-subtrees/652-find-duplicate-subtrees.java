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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        if(root == null) return null; 
        
        Map<String, Integer> freq = new HashMap(); 
        List<TreeNode> res = new ArrayList(); 
        
        duplicateSubtrees(root, freq, res); 
        
        return res; 
    }
    
    public String duplicateSubtrees(TreeNode node, Map<String, Integer> freq, List<TreeNode> res){
        if(node == null) return "null";
        
        String key = "left:" + duplicateSubtrees(node.left, freq, res) + ", root:" + node.val + "right:" + duplicateSubtrees(node.right, freq, res); 
    
        freq.put(key, freq.getOrDefault(key, 0) + 1);
        
        if(freq.containsKey(key) && freq.get(key) == 2)
            res.add(node); 
     
        return key; 
    }
}