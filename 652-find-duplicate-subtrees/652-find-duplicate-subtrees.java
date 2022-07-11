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
        
        List<TreeNode> ans = new ArrayList(); 
        Map<String, Integer> freq = new HashMap(); 
        
        findDuplicateSubtrees(root, ans, freq);
        
        return ans; 
    }
    
    public String findDuplicateSubtrees(TreeNode node, List<TreeNode> ans, Map<String, Integer> freq){
        if(node == null)
            return "null";
        
        String leftSubTree = findDuplicateSubtrees(node.left, ans, freq);
        String rightSubTree = findDuplicateSubtrees(node.right, ans, freq);
        String currentSubTree = node.val + ", " + leftSubTree + ", " + rightSubTree; 
        
        freq.put(currentSubTree, freq.getOrDefault(currentSubTree, 0) + 1); 
        
        if(freq.get(currentSubTree) == 2)
            ans.add(node); 
        
        return currentSubTree; 
    }
}