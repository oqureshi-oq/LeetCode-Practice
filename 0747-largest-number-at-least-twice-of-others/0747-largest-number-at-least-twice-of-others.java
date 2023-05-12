class Solution {
    public int dominantIndex(int[] nums) {
        if(nums == null || nums.length == 0)
            return Integer.MIN_VALUE;
        
        int first = Integer.MIN_VALUE;
        int index = -1;
        int second = Integer.MIN_VALUE; 
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= first){
                second = first;
                first = nums[i];
                index = i; 
            } else if(nums[i] >= second){
                second = nums[i];
            }
        }
        
        return first >= 2 * second ? index: -1; 
    }
}