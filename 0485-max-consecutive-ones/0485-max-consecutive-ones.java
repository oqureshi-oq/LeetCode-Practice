class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null)
            return 0;
        
        int count = 0;
        int max = 0; 
        
        for(int n: nums){
            if(n == 1)
                max = ++count > max ? count: max; 
            else
                count = 0; 
        }
        
        return max; 
    }
}