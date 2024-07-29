// Time: O(n)
// Space: O(1) if not taking into account output space
class Solution {
    public int[] sortedSquares(int[] nums) {
        if(nums == null)
            return null;
        
        int[] ans = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        
        for(int i = nums.length-1; i >= 0; i--){
            int square; 
            
            if(Math.abs(nums[left]) < Math.abs(nums[right]))
                square = nums[right--];
            else
                square = nums[left++];
            
            ans[i] = square * square; 
        }
        
        return ans; 
    }
}