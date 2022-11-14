class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;
        
        for(int n: nums){
            if(count == 0)
                candidate = n; 
            count += candidate == n ? 1: -1; 
        }
        
        return candidate; 
    }
}