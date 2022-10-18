class Solution {
    public int singleNumber(int[] nums) {
        if(nums == null)
            return Integer.MIN_VALUE; 
        
        Map<Integer, Integer> counts = new HashMap(); 
        
        for(int n: nums){
            counts.put(n, counts.getOrDefault(n, 0) + 1); 
        }
        
        for(int n: nums){
            if(counts.get(n) == 1)
                return n; 
        }
        
        return Integer.MIN_VALUE; 
    }
}