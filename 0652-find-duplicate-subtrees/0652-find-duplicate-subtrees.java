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
    Map<String, Integer> seenCount; 
    List<TreeNode> list; 
    
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        seenCount = new HashMap(); 
        list = new ArrayList(); 
        
        findDuplicateSubtreesHelper(root);
        
        return list; 
    }
    
    public String findDuplicateSubtreesHelper(TreeNode node){
        if(node == null)
            return "null";
        
        String left = findDuplicateSubtreesHelper(node.left);
        String right = findDuplicateSubtreesHelper(node.right); 
        String subTree = node.val + ", " + left + ", " + right;
        
        seenCount.put(subTree, seenCount.getOrDefault(subTree, 0) + 1); 
        
        if(seenCount.get(subTree) == 2)
            list.add(node); 
        
        return subTree;  
    }
}