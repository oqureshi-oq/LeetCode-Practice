class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null)
            return 0;
        
        int max = 0;
        int current = 0;
        
        for(int n: nums){
            if(n == 1)
                max = Math.max(++current, max);
            else
                current = 0;
        }
        
        return max; 
    }
}