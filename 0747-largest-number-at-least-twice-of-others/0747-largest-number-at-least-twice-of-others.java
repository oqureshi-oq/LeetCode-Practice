class Solution {
    public int dominantIndex(int[] nums) {
        if(nums == null || nums.length == 0)
            return -1;
        
        Integer max = null;
        int maxIndex = -1;
        Integer secondMax = null;
        
        for(int i = 0; i < nums.length; i++){
            if(max == null || nums[i] >= max){
                maxIndex = i;
                secondMax = max; 
                max = nums[i];
            } else if(secondMax == null || nums[i] > secondMax){
                secondMax = nums[i];
            }
        }
        
        return max >= 2 * secondMax ? maxIndex : -1; 
    }
}