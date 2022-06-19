class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null) return -1;
        
        int max = 0;
        int count = 0;
        
        for(int n: nums){
            if(n == 1)
                max = Math.max(max, ++count);
            else if(n == 0)
                count = 0;
            else
                return -1;
        }
        
        return max; 
    }
}