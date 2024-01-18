class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null)
            return 0;
        
        int count = 0;
        int max = 0; 
        
        for(int n: nums){
            if(n == 1)
                max = Math.max(max, ++count); 
            else
                count = 0; 
        }
        
        return max; 
    }
}