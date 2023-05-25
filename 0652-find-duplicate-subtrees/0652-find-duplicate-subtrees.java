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
    private Map<String, Integer> subTreeToId;
    private Map<Integer, Integer> subtrees; 
    private List<TreeNode> duplicates; 
    
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        subtrees = new HashMap(); 
        subTreeToId = new HashMap(); 
        duplicates = new ArrayList();
        helper(root); 
        return duplicates; 
    }
    
    public String helper(TreeNode node){
        if(node == null)
            return "null";
        
        String left = helper(node.left);
        String right = helper(node.right);
        String subTree = "left: " + left + ", current: " + node.val + ", right: " + right;
        
        if(!subTreeToId.containsKey(subTree))
            subTreeToId.put(subTree, subTreeToId.size() + 1);
        
        int id = subTreeToId.get(subTree); 
        
        subtrees.put(id, subtrees.getOrDefault(id, 0) + 1);
        
        if(subtrees.get(id) == 2)
            duplicates.add(node);
        
        return subTree; 
    }
}