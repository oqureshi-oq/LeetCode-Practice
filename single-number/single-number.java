class Solution {
    public int singleNumber(int[] nums) {
        if(nums == null || nums.length == 0) return 0; 
        int x = 0; 
        
        for(int n: nums){
            x ^= n; 
        }
        
        return x; 
    }
}