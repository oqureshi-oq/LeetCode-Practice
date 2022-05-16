class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null || nums.length == 0) return false; 
        
        Map<Integer, Integer> map = new HashMap(); 
        
        for(int right = 0, left = 0; right < nums.length; right++){
            if(right - left > k)
                map.remove(nums[left++]);
            
            if(map.containsKey(nums[right]))
                return true; 
            
            map.put(nums[right], right);  
        }
        
        return false; 
    }
}