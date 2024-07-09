class Solution {
    public int[] sortedSquares(int[] nums) {
        if(nums == null)
            return null;
        
        int[] ans = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        
        for(int write = nums.length-1; write >= 0; write--){
            int square; 
            
            if(Math.abs(nums[left]) > Math.abs(nums[right]))
                square = nums[left++];
            else 
                square = nums[right--];
            
            ans[write] = square * square; 
        }
        
        return ans; 
    }
}