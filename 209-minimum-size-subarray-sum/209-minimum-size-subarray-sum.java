class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums == null) return 0; 
        
        int min = nums.length+1; 
        
        for(int left = 0, right = 0; right < nums.length; right++){
            target -= nums[right]; 
            
            while(target <= 0){
                min = Math.min(min, right-left+1); 
                target += nums[left++]; 
            }
        }
        
        return min == nums.length+1 ? 0: min; 
    }
}