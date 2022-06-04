class Solution {
    public int findMin(int[] nums) {
        if(nums == null)
            return -1;
        
        int left = 0;
        int right = nums.length - 1;
        
        while(left < right){
            int mid = left + (right - left)/2; 
            
            if(Math.min(nums[left], nums[mid]) < Math.min(nums[mid], nums[right]))
                return nums[left]; 
            else if(Math.min(nums[left], nums[mid]) == Math.min(nums[mid], nums[right]))
                right = mid; 
            else
                left = mid+1; 
        }
        
        return nums[left]; 
    }
}