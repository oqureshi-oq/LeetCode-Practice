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
    
    private Map<String, Integer> map; 
    private List<TreeNode> res; 
    
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        if(root == null) return null; 
        
        map = new HashMap(); 
        res = new ArrayList(); 
        findDuplicateSubtreesString(root); 
        
        return res; 
    }
    
    public String findDuplicateSubtreesString(TreeNode node){
        if(node == null) return "null"; 
        
        String treeNodeString = "left: " + findDuplicateSubtreesString(node.left) 
            + ", current: " + node.val + ", right: " + findDuplicateSubtreesString(node.right); 
        
        map.put(treeNodeString, map.getOrDefault(treeNodeString, 0) + 1); 
        
        if(map.get(treeNodeString) == 2)
            res.add(node); 
        
        return treeNodeString; 
    }
}