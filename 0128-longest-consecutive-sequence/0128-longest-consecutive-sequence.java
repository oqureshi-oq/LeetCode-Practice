class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null)
            return 0;
        
        Set<Integer> seen = new HashSet(); 
        int max = 0;
        
        for(int n: nums){
            seen.add(n);
        }
        
        for(int n: nums){
            int count = 0;
            
            if(seen.contains(n-1))
                continue; 
            
            while(seen.contains(n+count))
                count++; 
            
            max = Math.max(count, max);
        }
        
        return max; 
    }
}