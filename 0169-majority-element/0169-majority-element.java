class Solution {
    public int majorityElement(int[] nums) {
        if(nums == null)
            return Integer.MIN_VALUE; 
        
        Map<Integer, Integer> map = new HashMap(); 
        
        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0) + 1); 
            if(map.get(n) > nums.length/2)
                return n; 
        }
        
        return Integer.MIN_VALUE;
    }
}