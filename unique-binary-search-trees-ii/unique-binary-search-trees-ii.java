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
    public List<TreeNode> generateTrees(int n) {
        return generateTrees(1, n); 
    }
    
    public List<TreeNode> generateTrees(int start, int end){
        List<TreeNode> list = new ArrayList();
        
        if(start > end){
            list.add(null); 
            return list; 
        } 
        
        for(int i = start; i <= end; i++){
            List<TreeNode> leftSubtrees = generateTrees(start, i-1); 
            List<TreeNode> rightSubtrees = generateTrees(i+1, end);
            
            for(int j = 0; j < leftSubtrees.size(); j++){
                for(int k = 0; k < rightSubtrees.size(); k++){
                    TreeNode current = new TreeNode(i); 
                    current.left = leftSubtrees.get(j); 
                    current.right = rightSubtrees.get(k); 
                    list.add(current); 
                }
            }
        }
        
        return list; 
    }
}