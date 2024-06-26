/*
 * Time: O(n)
 * Space: O(1)
 */ 
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null)
            return 0;
        
        int maxCount = 0;
        int currentCount = 0;
        
        for(int n: nums){
            if(n == 1)
                maxCount = Math.max(++currentCount, maxCount);
            else
                currentCount = 0;
        }
        
        return maxCount; 
    }
}