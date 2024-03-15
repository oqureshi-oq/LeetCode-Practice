class Solution {
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
    
    private boolean hasEvenNumberOfDigits(int n){
        n = Math.abs(n);
        
        return 10 <= n && n <= 99 || 1000 <= n && n <= 9999 || n == 100000;
    }
}