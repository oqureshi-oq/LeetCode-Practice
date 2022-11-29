class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null)
            return 0;
        
        Set<Integer> set = new HashSet(); 
        int max = 0; 
        
        for(int n: nums){
            set.add(n);
        }
        
        for(int n: nums){
            if(set.contains(n+1))
                continue; 
            int count = 1; 
            while(set.contains(n-count))
                count++; 
            max = Math.max(max, count); 
        }
        
        return max; 
    }
}