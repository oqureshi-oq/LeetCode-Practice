class Solution {
    public int findMaxK(int[] nums) {
        if(nums == null)
            return -1;
        
        Set<Integer> seen = new HashSet(); 
        
        for(int n: nums){
            if(n < 0)
                seen.add(n);
        }
        
        int max = -1; 
        for(int n: nums){
            if(n > 0 && seen.contains(-1 * n) && n > max)
                max = n; 
        }
        
        return max; 
    }
}