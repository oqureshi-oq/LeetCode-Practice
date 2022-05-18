class Solution {
    public int findNumbers(int[] nums) {
        if(nums == null) return -1;
        
        int count = 0; 
        
        for(int n: nums){
            if(hasEvenNumDigits(n))
                count++; 
        }
        
        return count; 
    }
    
    public boolean hasEvenNumDigits(int n){
        int numDigits = (int) Math.log10(Math.abs(n)) + 1; 
        return numDigits % 2 == 0;  
    }
}