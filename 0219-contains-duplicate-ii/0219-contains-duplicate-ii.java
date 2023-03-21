class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null || k <= 0)
            return false;
        
        Set<Integer> seenRange = new HashSet(k); 
        
        for(int left = 0, right = 0; right < nums.length; right++){
            if(right - left > k)
                seenRange.remove(nums[left++]); 
            
            if(!seenRange.add(nums[right]))
                return true;
        }
        
        return false; 
    }
}