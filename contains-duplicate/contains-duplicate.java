class Solution {
    public boolean containsDuplicate(int[] nums) {
        if(nums == null) return false; 
        
        Set<Integer> set = new HashSet(); 
        
        for(int n: nums){
            if(set.contains(n)) return true;
            set.add(n); 
        }
        
        return false; 
    }
}