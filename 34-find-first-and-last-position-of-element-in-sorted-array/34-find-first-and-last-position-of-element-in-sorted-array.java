class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0) return new int[]{-1, -1};
        
        int[] ans = new int[2]; 
        ans[0] = findFirst(nums, target); 
        ans[1] = findLast(nums, target); 
        
        return ans; 
    }
    
    public int findFirst(int[] nums, int target){
        if(nums == null) return -1; 
        
        int left = 0;
        int right = nums.length - 1; 
        
        while(right - left > 1){
            int mid = left + (right - left)/2; 
            
            if(nums[mid] == target)
                right = mid; 
            else if(target < nums[mid])
                right = mid-1;
            else
                left = mid+1; 
        }
        
        if(nums[left] == target)
            return left;
        
        if(nums[right] == target)
            return right; 
        
        return -1; 
    }
    
    public int findLast(int[] nums, int target){
        if(nums == null) return -1; 
        
        int left = 0;
        int right = nums.length - 1; 
        
        while(right - left > 1){
            int mid = left + (right - left)/2; 
            
            if(nums[mid] == target){
                left = mid;
            }else if(nums[mid] < target)
                left = mid+1;
            else
                right = mid-1; 
        }
    
        if(nums[right] == target)
            return right; 
        
        if(nums[left] == target)
            return left;
        
        return -1; 
    }
}