class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null)
            return false;
        
        Set<Integer> seen = new HashSet(); 
        
        for(int i = 0; i < nums.length; i++){
            if(i - k - 1 >= 0)
                seen.remove(nums[i-k-1]);
            
            if(!seen.add(nums[i]))
                return true;
        }
        
        return false; 
    }
}