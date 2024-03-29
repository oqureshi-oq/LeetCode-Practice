class Solution {
    public int[] sortedSquares(int[] nums) {
        if(nums == null)
            return new int[0]; 
        
        int[] ans = new int[nums.length];
        int left = 0;
        int right = nums.length - 1; 
        
        for(int i = nums.length - 1; i >= 0; i--){
            if(Math.abs(nums[left]) < Math.abs(nums[right]))
                ans[i] = nums[right] * nums[right--];
            else
                ans[i] = nums[left] * nums[left++]; 
        }
        
        return ans; 
    }
}