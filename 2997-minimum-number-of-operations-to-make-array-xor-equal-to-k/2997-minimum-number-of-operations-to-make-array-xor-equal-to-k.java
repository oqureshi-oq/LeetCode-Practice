class Solution {
    public int minOperations(int[] nums, int k) {
        int x = k;
        
        for(int n: nums){
            x ^= n; 
        }
        
        int count = 0;
        while(x != 0){
            if((x & 1) == 1)
                count++; 
            
            x = x >> 1; 
        }
        
        return count; 
    }
}