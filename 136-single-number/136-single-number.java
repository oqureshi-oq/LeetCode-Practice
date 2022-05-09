class Solution {
    public int singleNumber(int[] nums) {
        if(nums == null) return -1; 
        
        int x = 0; 
        
        for(int n: nums){
            x ^= n; 
        }
        
        return x; 
    }
}
