class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums == null)
            return 0;
        
        int left = 0;
        int right = 0;
        int sum = 0;
        int min = nums.length+1; 
        
        while(right < nums.length){
            sum += nums[right++];
            
            while(sum >= target){
                min = Math.min(min, right-left);
                sum -= nums[left++];
            }
        }
        
        return min != nums.length+1 ? min: 0; 
    }
}