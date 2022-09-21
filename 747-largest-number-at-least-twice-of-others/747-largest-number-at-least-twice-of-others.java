class Solution {
    public int dominantIndex(int[] nums) {
        if(nums == null)
            return -1;
        
        Integer first = null; 
        Integer firstIndex = null; 
        Integer second = null;
        
        for(int i = 0; i < nums.length; i++){
            int n = nums[i]; 
            
            if(first == null || n >= first){
                second = first; 
                first = n;
                firstIndex = i; 
            } else if(second == null || n > second){
                second = n; 
            }
        }
        
        if(first == null)
            return -1;
        
        return second != null && first >= 2 * second ? firstIndex: -1; 
        
    }
}