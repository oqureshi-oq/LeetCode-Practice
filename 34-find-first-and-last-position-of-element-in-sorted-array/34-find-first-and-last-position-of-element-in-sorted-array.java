class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{findFirst(nums, target), findLast(nums, target)};
    }
    
    public int findFirst(int[] nums, int target){
        if(nums == null || nums.length == 0) return -1;
        
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
        
        return nums[left] == target ? left: -1; 
    }
    
    public int findLast(int[] nums, int target){
        if(nums == null || nums.length == 0) return -1;
        
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
        
        return nums[right] == target ? right: -1;  
    }
}