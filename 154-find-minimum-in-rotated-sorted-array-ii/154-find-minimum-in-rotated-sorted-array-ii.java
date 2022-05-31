class Solution {
    public int findMin(int[] nums){
        return findMin(nums, 0, nums.length - 1); 
    }
    
    public int findMin(int[] nums, int left, int right) {
        if(nums == null)
            return -1; 
        
        while(right - left > 1){
            int mid = left + (right - left)/2; 
            
            if(nums[left] == nums[mid] && nums[mid] == nums[right])
                return Math.min(findMin(nums, left, mid), findMin(nums, mid, right)); 
            else if(nums[left] <= nums[mid]){
                if(nums[left] < nums[right])
                    return nums[left]; 
                else
                    left = mid; 
            } else {
                right = mid; 
            }
        }
        
        return Math.min(nums[left], nums[right]); 
    }
}