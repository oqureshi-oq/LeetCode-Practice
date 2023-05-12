class Solution {
    public int dominantIndex(int[] nums) {
        if(nums == null || nums.length == 0)
            return Integer.MIN_VALUE;
        
        int firstIndex = -1;
        int secondIndex = -1; 
        
        for(int i = 0; i < nums.length; i++){
            if(firstIndex == -1 || nums[i] >= nums[firstIndex]){
                secondIndex = firstIndex;
                firstIndex = i; 
            } else if(secondIndex == -1 || nums[i] >= nums[secondIndex]){
                secondIndex = i;
            }
        }
        
        return nums[firstIndex] >= 2 * nums[secondIndex] ? firstIndex: -1; 
    }
}