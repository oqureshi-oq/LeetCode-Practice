class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0; 
        
        int max = nums[0]; 
        
        for(int i = 1; i < nums.length; i++){
            nums[i] = Math.max(nums[i], nums[i-1]+nums[i]);
            max = Math.max(max, nums[i]); 
        }
        
        return max; 
    }
}

/*
maxSubarrayEndingAt(i) = nums[i] if i == 0
                       = max(nums[i], nums[i] + maxSubarrayEndingAt(i-1))
                       
ans is max of all maxSubarrayEndingAt(i) from i = 0 to nums.length-1 (inclusive) 
                         
*/ 