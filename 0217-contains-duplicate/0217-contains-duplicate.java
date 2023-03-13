class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums == null)
            return false;
        
        Set<Integer> seen = new HashSet(); 
        
        for(int n: nums){
            if(!seen.add(n))
                return true; 
        }
        
        return false; 
    }
}