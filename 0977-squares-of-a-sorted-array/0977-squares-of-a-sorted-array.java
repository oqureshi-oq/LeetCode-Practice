class Solution {
    public int[] sortedSquares(int[] nums) {
        if(nums == null)
            return null; 
        
        int[] ans = new int[nums.length]; 
        int left = 0;
        int right = nums.length - 1; 
        
        for(int write = nums.length - 1; write >= 0; write--){
            if(Math.abs(nums[left]) > Math.abs(nums[right]))
                ans[write] = nums[left] * nums[left++]; 
            else
                ans[write] = nums[right] * nums[right--]; 
        }
        
        return ans; 
    }
}