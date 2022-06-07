class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0) return new int[]{-1,-1}; 
        return new int[]{findFirst(nums, target), findLast(nums, target)}; 
    }
    
    int findFirst(int[] nums, int target){
        if(nums == null) return -1;
        
        int left = 0;
        int right = nums.length - 1; 
        
        while(left < right){
            int mid = left + ((right - left) >> 1);
            
            if(nums[mid] == target)
                right = mid; 
            else if(nums[mid] < target)
                left = mid+1;
            else
                right = mid-1; 
        }
        
        return 0 <= right && right < nums.length && nums[right] == target ? right: -1;
    }
    
    int findLast(int[] nums, int target){
        if(nums == null) return -1;
        
        int left = 0;
        int right = nums.length - 1;
        
        while(left < right){
            int mid = right - ((right - left) >> 1); 
            
            if(nums[mid] == target)
                left = mid; 
            else if(nums[mid] < target)
                left = mid+1;
            else
                right = mid-1; 
        }
        
        return 0 <= left && left < nums.length && nums[left] == target ? left: -1;
    }
}