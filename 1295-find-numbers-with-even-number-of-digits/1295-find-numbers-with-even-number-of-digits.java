class Solution {
    private boolean hasEvenNumberOfDigits(int n){
        int numberOfDigits = (int) Math.log10(Math.abs(n)) + 1; 
        return numberOfDigits % 2 == 0; 
    }
    
    public int findNumbers(int[] nums) {
        if(nums == null)
            return 0;
        
        int count = 0;
        
        for(int n: nums){
            if(hasEvenNumberOfDigits(n))
                count++;
        }
        
        return count; 
    }
}