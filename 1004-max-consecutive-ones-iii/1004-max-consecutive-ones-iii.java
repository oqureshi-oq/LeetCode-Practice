class Solution {
    public int longestOnes(int[] nums, int k) {
        if(nums == null) return -1;
        
        int left = 0;
        int right = 0;
        
        while(right < nums.length){
            if(nums[right] == 0)
                k--; 
            
            if(k < 0 && nums[left++] == 0){
                k++; 
            }
            
            right++;
        }
        
        return right - left; 
    }
}