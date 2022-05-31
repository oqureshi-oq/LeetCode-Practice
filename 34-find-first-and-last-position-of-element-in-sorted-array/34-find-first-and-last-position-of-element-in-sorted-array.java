class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0) return new int[]{-1, -1}; 
        
        int[] ans = new int[2];
        ans[0] = findFirst(nums, target); 
        ans[1] = findLast(nums, target); 
        
        return ans; 
    }
    
    public int findFirst(int[] nums, int target){
        if(nums == null || nums.length == 0) return -1; 
        
        int left = 0;
        int right = nums.length - 1; 
        
        while(left < right){
            int mid = left + (right - left)/2; 
            
            if(nums[mid] == target)
                right = mid; 
            else if(nums[mid] < target)
                left = mid+1; 
            else
                right = mid-1; 
        }

        return left >= 0 && left < nums.length && nums[left] == target ? left: -1; 
    }
    
    public int findLast(int[] nums, int target){
        if(nums == null || nums.length == 0) return -1; 
        
        int left = 0; 
        int right = nums.length - 1; 
        
        while(left < right){
            int mid = left + (right - left)/2+1; 
            
            System.out.println("mid: " + mid); 
            
            if(nums[mid] == target){
                left = mid;
            }else if(nums[mid] < target)
                left = mid+1; 
            else
                right = mid-1; 
        }
        
        return left >= 0 && left < nums.length && nums[left] == target ? left: -1; 
    }
}