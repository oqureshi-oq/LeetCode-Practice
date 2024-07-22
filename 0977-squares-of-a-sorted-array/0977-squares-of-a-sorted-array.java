// Time: O(n)
// Space: O(1) but O(n) if output is taken into account
class Solution {
    public int[] sortedSquares(int[] nums) {
        if(nums == null)
            return null;
        
        int[] ans = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        
        for(int i = nums.length-1; i >= 0; i--){
            int square;
            
            if(Math.abs(nums[left]) > Math.abs(nums[right]))
                square = nums[left++];
            else
                square = nums[right--];
            
            ans[i] = square * square; 
        }
        
        return ans; 
    }
}