class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums == null)
            return 0;
        
        int min = nums.length+1; 
        int total = 0; 
        
        for(int left = 0, right = 0; right < nums.length; right++){
            total += nums[right];
            
            while(total >= target){
                min = Math.min(min, right - left + 1);
                total -= nums[left++]; 
            }
        }
        
        return min != nums.length+1 ? min: 0; 
    }
}