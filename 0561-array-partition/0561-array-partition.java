class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length % 2 != 0)
            return Integer.MIN_VALUE;
        
        Arrays.sort(nums);
        int sum = 0; 
        
        for(int i = 0; i < nums.length; i += 2){
            sum += nums[i];
        }
        
        return sum; 
    }
}