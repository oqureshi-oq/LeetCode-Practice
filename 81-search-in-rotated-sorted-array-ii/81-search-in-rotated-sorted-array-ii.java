class Solution {
    public boolean search(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }
    
    public boolean search(int[] nums, int left, int right, int target) {
        if(nums == null)
            return false;
        
        while(left <= right){
            int mid = left + ((right - left) >> 1); 
            
            if(nums[mid] == target)
                return true; 
            else if(nums[left] == nums[mid] && nums[mid] == nums[right]){
                if(search(nums, left, mid-1, target)) return true;
                if(search(nums, mid+1, right, target)) return true;
                return false; 
            } else if(nums[left] <= nums[mid]){
                if(nums[left] <= target && target < nums[mid])
                    right = mid-1;
                else
                    left = mid+1; 
            } else {
                if(nums[mid] < target && target <= nums[right])
                    left = mid+1; 
                else
                    right = mid-1; 
            }
        }
        
        return false; 
    }
}