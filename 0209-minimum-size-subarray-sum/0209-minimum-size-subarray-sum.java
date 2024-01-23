class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums == null)
            return 0;
        
        int left = 0;
        int right = 0;
        int min = nums.length+1;
        int sum = 0;
        
        while(right < nums.length){
            sum += nums[right];
            
            while(sum - nums[left] >= target)
                sum -= nums[left++];
            
            if(sum >= target)
                min = Math.min(min, right - left + 1);
            
            right++;
        }
        
        return min == nums.length+1 ? 0: min; 
    }
}