class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null) return -1;
        
        int max = 0; 
        int count = 0; 
        Set<Integer> set = new HashSet(); 
        
        for(int n: nums){
            set.add(n); 
        }
        
        for(int n: nums){
            if(set.contains(n-1))
                continue;
            
            count = 0; 
            
            while(set.contains(n++)){
                max = Math.max(++count, max); 
            }
        }
        
        return max; 
    }
}