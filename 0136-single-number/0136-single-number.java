class Solution {
    public int singleNumber(int[] nums) {
        if(nums == null)
            return Integer.MIN_VALUE; 
        
        Map<Integer, Integer> map = new HashMap(); 
        
        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0)  +1);
        }
        
        for(int n: nums){
            if(map.get(n) == 1)
                return n; 
        }
        
        return Integer.MAX_VALUE;
    }
}