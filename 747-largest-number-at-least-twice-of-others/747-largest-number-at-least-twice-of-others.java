class Solution {
    public int dominantIndex(int[] nums) {
        if(nums == null) return -1;
        
        Integer first = null;
        Integer second = null; 
        int index = -1; 
        
        for(int i = 0; i < nums.length; i++){
            if(first == null || nums[i] > first){
                second = first;
                first = nums[i];
                index = i; 
            } else if(second == null || nums[i] > second){
                second = nums[i]; 
            }
        }
        
        if(first == null) return -1;
        if(first != null && second == null) return index; 
        
        return first >= second * 2 ? index: -1; 
    }
}