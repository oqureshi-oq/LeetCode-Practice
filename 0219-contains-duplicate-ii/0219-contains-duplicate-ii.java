class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null)
            return false; 
        
        Set<Integer> seen = new HashSet(); 
        int left = 0;
        int right = 0; 
        
        while(right < nums.length){
            if(seen.contains(nums[right]))
                return true; 
            
            seen.add(nums[right]);
            k--; 
            
            if(k < 0)
                seen.remove(nums[left++]); 
            
            right++; 
        }
        
        return false;
    }
}