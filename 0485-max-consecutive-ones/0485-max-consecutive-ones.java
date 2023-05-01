class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null)
            return -1;
        
        int count = 0;
        int maxCount = 0;
        
        for(int n: nums){
            if(n == 1)
                maxCount = Math.max(++count, maxCount);
            else
                count = 0;
        }
        
        return maxCount; 
    }
}