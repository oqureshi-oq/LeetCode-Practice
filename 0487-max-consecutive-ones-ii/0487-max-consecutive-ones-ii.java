class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null)
            return 0;
        
        int zeroCount = 0;
        int left = 0;
        int right = 0;
        
        while(right < nums.length){
            if(nums[right] == 0)
                zeroCount++;
            
            right++;
            
            if(zeroCount > 1 && nums[left++] == 0)
                zeroCount-- ; 
        }
        
        return right - left; 
    }
}