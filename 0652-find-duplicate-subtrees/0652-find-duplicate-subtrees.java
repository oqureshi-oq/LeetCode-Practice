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
        if(root == null)
            return new ArrayList(); 
        
        List<TreeNode> list = new ArrayList(); 
        Map<String, Integer> seen = new HashMap(); 
        
        findDuplicateSubtrees(root, list, seen); 
        
        return new ArrayList(list); 
    }
    
    private String findDuplicateSubtrees(TreeNode root, List<TreeNode> list, Map<String, Integer> seen){
        if(root == null)
            return "null"; 
        
        String left = "left: " + findDuplicateSubtrees(root.left, list, seen); 
        String right = "right: " + findDuplicateSubtrees(root.right, list, seen); 
        String currentSubTree = "root: " + root.val + left + right; 
        
        seen.put(currentSubTree, seen.getOrDefault(currentSubTree, 0) + 1); 
        
        if(seen.get(currentSubTree) == 2)
            list.add(root);
        
        return currentSubTree; 
    }
}