class Solution {
    public int missingNumber(int[] nums) {
        if(nums == null)
            return -1;
        
        int expectedSum = (nums.length+1) * nums.length / 2;
                
        int actualSum = 0;
        for(int n: nums){
            actualSum += n;
        }
        
        return expectedSum - actualSum; 
    }
    
    ///0, 1, 2, 3
    

}