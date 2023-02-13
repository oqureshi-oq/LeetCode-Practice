class Solution {
    public int majorityElement(int[] nums) {
        if(nums == null || nums.length <= 0)
            return -1;
        
        int candidate = -1; 
        int count = 0; 
        
        for(int n: nums){
            if(count == 0)
                candidate = n; 
            
            count += candidate == n ? 1: -1; 
        }
        
        return candidate; 
    }
}