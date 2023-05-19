class Solution {
    public int findDuplicate(int[] nums) {
        if(nums == null)
            return 0;
        
        int ans = 0; 
        
        for(int i = 0; i < nums.length; i++){
            if(nums[Math.abs(nums[i])-1] < 0)
                ans = Math.abs(nums[i]); 
            else
                nums[Math.abs(nums[i])-1] *= -1;
        }
        
        for(int i = 0; i < nums.length; i++){
            nums[i] = Math.abs(nums[i]);
        }
        
        return ans; 
    }
}