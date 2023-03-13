class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> seen = new HashSet(); 
        
        for(int n: nums){
            if(!seen.add(n))
                seen.remove(n);
        }
        
        for(int n: seen){
            return n; 
        }
        
        return 0; 
    }
}