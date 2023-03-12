class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums == null)
            return 0;
        
        int minLength = nums.length+1; 
        
        for(int sum = 0, left = 0, right = 0; right < nums.length; right++){
            sum += nums[right];
            
            while(sum >= target){
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left++]; 
            }
        }
        
        return minLength == nums.length+1 ? 0: minLength; 
    }
}