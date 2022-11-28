class Solution {
    public int totalHammingDistance(int[] nums) {
        if(nums == null || nums.length < 2)
            return 0; 
        
        int sum = 0; 
        
        for(int i = 0; i < 32; i++){
            int count = 0; //nums.length;
            for(int n: nums){
                if((n & (1 << i)) != 0)
                    count++; 
            }
            sum += count * (nums.length-count); 
        }
        
        return sum; 
    }
}