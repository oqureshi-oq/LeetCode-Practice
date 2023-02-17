class Solution {
    public int maxFrequency(int[] nums, int k) {
        if(nums == null)
            return 0;
        
        int sum = 0;
        int ans = 0; 
        
        Arrays.sort(nums);
        
        for(int left = nums.length-1, right = nums.length-1; left >=0 ; left--){
            sum += nums[left]; 
            
            while((right - left+1) * nums[right] - sum > k)
                sum -= nums[right--]; 
            
            ans = Math.max(ans, right - left + 1); 
        }
        
        return ans; 
    
    }
}