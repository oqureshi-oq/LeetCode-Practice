class Solution {
    public int dominantIndex(int[] nums) {
        if(nums == null || nums.length == 0)
            return -1; 
        
        Integer first = null;
        Integer second = null;
        int index = -1;
        
        for(int i = 0; i < nums.length; i++){
            Integer n = nums[i];
            if(first == null || n >= first){
                second = first;
                first = n;
                index = i;
            } else if(second == null || n >= second){
                second = n;
            }
        }
        
        return second == null || first >= 2 * second ? index: -1; 
    }
}