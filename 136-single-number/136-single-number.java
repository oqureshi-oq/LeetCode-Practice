class Solution {
    public int singleNumber(int[] nums) {
        if(nums == null || nums.length == 0)
            return -1; 
        
        Set<Integer> set = new HashSet(); 
        
        for(int n: nums){
            if(set.contains(n))
                set.remove(n);
            else
                set.add(n); 
        }
        
        for(int n: set){
            return n; 
        }
        
        return -1; 
    }
}