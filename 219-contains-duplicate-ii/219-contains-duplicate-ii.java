class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null || nums.length == 0) return false; 
        
        Set<Integer> set = new HashSet(); 
        
        for(int right = 0, left = 0; right < nums.length; right++){
            if(right - left > k)
                set.remove(nums[left++]);
            
            if(set.contains(nums[right]))
                return true; 
            
            set.add(nums[right]);  
        }
        
        return false; 
    }
}