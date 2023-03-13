class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> seen = new HashSet(); 
        
        int expected = 0;
        int actual = 0; 
        
        for(int n: nums){
            if(!seen.add(n))
                expected += 2 * n; 
            actual += n; 
        }
        
        return actual - expected; 
    }
}