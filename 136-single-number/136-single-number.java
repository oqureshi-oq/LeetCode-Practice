class Solution {
    public int singleNumber(int[] nums) {
        if(nums == null) return 0;
        
        int singleNumber = 0;
        
        for(int n: nums){
            singleNumber ^= n; 
        }
        
        return singleNumber; 
    }
}