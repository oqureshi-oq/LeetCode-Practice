class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null) return false; 
        
        Set<Integer> seen = new HashSet(); 
        
        for(int i = 0, j = 0; j < nums.length; j++){
            if(seen.contains(nums[j]))
                return true;
            
            seen.add(nums[j]);
            k--; 
            
            if(k < 0){
                seen.remove(nums[i++]);
                k++; 
            }
        }
        
        return false; 
    }
}