class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null)
            return 0;
        
        int count = 0;
        int max = 0; 
        
        for(int n: nums){
            if(n == 1){
                count++; 
            } else{
                max = Math.max(count, max);
                count = 0; 
            }
        }
        
        return Math.max(max, count); 
    }
}