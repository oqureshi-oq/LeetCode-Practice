class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums == null) return -1; 
        
        int left = 0;
        int right = nums.length - 1; 
        
        while(left <= right){
            int mid = left + (right - left)/2; 
            
            if(nums[mid] == target)
                return mid; 
            else if(nums[mid] < target){
                if(mid+1 >= nums.length || nums[mid+1] > target)
                    return mid+1;
                else
                    left = mid+1; 
            } else if (target < nums[mid]){
                if(mid == 0)
                    return mid;
                else
                    right = mid-1; 
            }
        }
        
        return -1; 
    }
}