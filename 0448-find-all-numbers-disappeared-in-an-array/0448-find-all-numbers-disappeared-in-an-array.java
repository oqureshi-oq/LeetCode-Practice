/*
 * Time: O(n)
 * Space: O(1) if output list is not considered 
 */
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums == null)
            return null;
        
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i])-1;
            nums[index] = -1 * Math.abs(nums[index]);
        }
        
        List<Integer> list = new LinkedList(); 
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0)
                list.add(i+1);
            else
                nums[i] *= -1; 
        }
        
        return list; 
    }
}