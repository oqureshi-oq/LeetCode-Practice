class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums == null) return 0;
        
        int sum = 0; 
        int min = nums.length+1; 
        
        for(int left = 0, right = 0; right < nums.length; right++){
            sum += nums[right]; 
            
            while(sum >= target){
                min = Math.min(min, right-left+1); 
                sum -= nums[left++]; 
            }
        }
        
        return min == nums.length+1 ? 0: min; 
    }
}