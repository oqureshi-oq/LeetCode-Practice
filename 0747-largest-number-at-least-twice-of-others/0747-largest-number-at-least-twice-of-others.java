class Solution {
    public int dominantIndex(int[] nums) {
        if(nums == null || nums.length <= 0)
            return -1; 
        
        int first = nums[0];
        int index = 0;
        int second = first; 
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > first){
                second = first;
                first = nums[i];
                index = i;
            } else if(second == first || nums[i] > second){
                second = nums[i];
            }
        }
        
        return first >= second * 2 ? index: -1; 
    }
}