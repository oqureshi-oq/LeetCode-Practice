class Solution {
    public int firstMissingPositive(int[] nums) {
        if(nums == null)
            return -1;
        
        Set<Integer> seen = new HashSet(); 
        int max = 0; 
        
        for(int n: nums){
            seen.add(n);
            max = Math.max(max, n); 
        }
        
        for(int i = 1; i < max; i++){
            if(!seen.contains(i))
                return i; 
        }
        
        return max+1; 
    }
}