class Solution {
    public int missingNumber(int[] nums) {
        if(nums == null)
            return -1;
        
        int expectedSum = nums.length;
        int actualSum = 0;
        
        for(int i = 0; i < nums.length; i++){
            expectedSum += i;
            actualSum += nums[i];
        }
        
        return expectedSum - actualSum; 
    }
}