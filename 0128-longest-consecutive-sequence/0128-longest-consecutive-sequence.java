class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null)
            return 0;
        
        Set<Integer> seen = new HashSet(); 
        
        for(int n: nums){
            seen.add(n);
        }
        
        int lcs = 0;
        
        for(int n: seen){
            if(seen.contains(n-1))
                continue;
            
            int count = 0;
            
            while(seen.contains(n)){
                count++; 
                n++; 
            }
            
            lcs = Math.max(lcs, count); 
        }
        
        return lcs; 
    }
}