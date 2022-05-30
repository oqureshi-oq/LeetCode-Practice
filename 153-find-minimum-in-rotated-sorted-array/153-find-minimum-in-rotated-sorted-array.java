class Solution {
    public int findMin(int[] nums) {
        if(nums == null) return -1; 
        
        int left = 0;
        int right = nums.length - 1; 
        
        while(right - left > 1){
            int mid = left + (right - left) / 2; 
            
            if(nums[left] < nums[mid]){
                if(nums[left] > nums[right])
                    left = mid;
                else
                    right = mid; 
            } else {
                right = mid;
            }
        }
        
        return Math.min(nums[left], nums[right]); 
    }
}