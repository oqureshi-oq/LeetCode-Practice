class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{findFirst(nums, target), findLast(nums, target)};
    }
    
    public int findFirst(int[] nums, int target){
        if(nums == null)
            return -1; 
        
        int left = 0;
        int right = nums.length-1; 
        int index = -1; 
        
        while(left <= right){
            int mid = left + (right - left)/2; 
            
            if(nums[mid] == target){
                right = mid-1;
                index = mid; 
            }
            else if(nums[mid] < target)
                left = mid+1;
            else
                right = mid-1; 
        }
        
        return index; 
    }
    
    public int findLast(int[] nums, int target){
        if(nums == null)
            return -1; 
        
        int left = 0;
        int right = nums.length-1; 
        int index = -1; 
        
        while(left <= right){
            int mid = left + (right - left)/2; 
            
            if(nums[mid] == target){
                left = mid+1; 
                index = mid; 
            }else if(nums[mid] < target)
                left = mid+1;
            else
                right = mid-1; 
        }
        
        return index; 
    }
}