class Solution {
    public int findMin(int[] nums) {
        if(nums == null || nums.length == 0) return -1;
        
        int left = 0;
        int right = nums.length - 1;
        
        while(left < right){
            int mid = left + ((right - left) >> 1);
            
            if(nums[left] == nums[mid] && nums[mid] == nums[right]){
                left++;
                right--;
            } else if(nums[left] <= nums[mid]){
                if(nums[left] < nums[right])
                    return nums[left];
                else
                    left = mid+1; 
            } else {
                right = mid; 
            }
        }
        
        return nums[left];
    }
}