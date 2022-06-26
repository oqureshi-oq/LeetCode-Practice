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
        if(n == 0) return false;
        
        int numDigits = 0; 
        
        while(n != 0){
            numDigits++;
            n /= 10; 
        }
        
        return numDigits % 2 == 0; 
    }
}