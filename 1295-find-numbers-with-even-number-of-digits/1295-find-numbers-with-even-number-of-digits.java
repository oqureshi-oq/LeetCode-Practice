class Solution {
    public int findNumbers(int[] nums) {
        if(nums == null)
            return 0;
        
        int count = 0;
        
        for(int n: nums){
            int numDigits = n == 0 ? 1: 0;
            
            while(n != 0){
                numDigits++; 
                n /= 10; 
            }
            
            if(numDigits % 2 == 0)
                count++; 
        }
        
        return count; 
    }
}