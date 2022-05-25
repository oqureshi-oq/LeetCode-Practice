class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null) return false; 
        
        Set<Integer> set = new HashSet(); 
        
        for(int left = 0, right = 0; right < nums.length; right++){
            if(set.contains(nums[right]))
                return true;
            
            set.add(nums[right]); 
            k--; 
            
            if(k < 0)
                set.remove(nums[left++]); 
        }
        
        return false; 
    }
}