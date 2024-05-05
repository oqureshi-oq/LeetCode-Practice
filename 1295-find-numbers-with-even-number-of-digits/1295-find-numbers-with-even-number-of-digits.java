class Solution {
    public int findNumbers(int[] nums) {
        if(nums == null)
            return 0;
        
        int count = 0;
        
        for(int n: nums){
            if(n == 0)
                continue; 
            
            int numDigits = (int) Math.log10(Math.abs(n)) + 1;
            if(numDigits % 2 == 0)
                count++; 
        }
        
        return count; 
    }
}