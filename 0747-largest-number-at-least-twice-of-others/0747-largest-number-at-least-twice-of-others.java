class Solution {
    public int dominantIndex(int[] nums) {
        if(nums == null || nums.length == 0)
            return -1; 
        
        Integer first = null;
        Integer second = null;
        int index = -1;
        
        for(int i = 0; i < nums.length; i++){
            if(first == null || nums[i] >= first){
                second = first;
                first = nums[i];
                index = i;
            } else if(second == null || nums[i] >= second){
                second = nums[i];
            }
        }
        
        return second == null || first >= 2 * second ? index: -1; 
    }
}