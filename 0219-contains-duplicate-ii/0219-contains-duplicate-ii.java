class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null)
            return false; 
        
        Set<Integer> seen = new HashSet();
        
        for(int left = 0, right = 0; right < nums.length; right++){
            if(right - left > k)
                seen.remove(nums[left++]);
            
            if(!seen.add(nums[right]))
                return true; 
        }
        
        return false; 
    }
}