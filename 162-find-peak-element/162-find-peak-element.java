class Solution {
    public int findPeakElement(int[] nums) {
        if(nums == null)
            return -1;
        
        int left = 0;
        int right = nums.length - 1; 
        
        while(left < right){
            int mid = left + (right - left)/2;
            
            if(mid+1 < nums.length && nums[mid] < nums[mid+1])
                left = mid+1; 
            else
                right = mid; 
        }
        
        return left; 
    }
}