class Solution {
    public int dominantIndex(int[] nums) {
        if(nums == null || nums.length == 0)
            return -1;
        
        Integer max = nums[0];
        int index = 0; 
        Integer secondMax = null; 
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > max){
                secondMax = max; 
                max = nums[i];
                index = i; 
            } else if (secondMax == null || nums[i] > secondMax){
                secondMax = nums[i];
            }
        }
        
        return secondMax != null && max >= 2*secondMax ? index: -1; 
    }
}