class Solution {
    public int findMaxK(int[] nums) {
        if(nums == null)
            return -1;
        
        Set<Integer> seen = new HashSet(); 
        int max = -1; 
        
        for(int n: nums){
            seen.add(n); 
            if(seen.contains(-1 * n) && Math.abs(n) > max)
                max = Math.abs(n); 
        }
        
        return max; 
    }
}