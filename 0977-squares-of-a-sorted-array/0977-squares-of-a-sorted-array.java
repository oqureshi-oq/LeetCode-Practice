class Solution {
    public int[] sortedSquares(int[] nums) {
        if(nums == null)
            return null;
        
        int left = 0;
        int right = nums.length - 1; 
        int[] ans = new int[nums.length];
        
        for(int i = nums.length-1; i >= 0; i--){
            if(Math.abs(nums[left]) > Math.abs(nums[right]))
                ans[i] = nums[left] * nums[left++];
            else
                ans[i] = nums[right] * nums[right--];
        }
        
        return ans; 
    }
}