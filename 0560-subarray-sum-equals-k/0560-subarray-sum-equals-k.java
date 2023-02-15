class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums == null)
            return 0;
        
        int sum = 0; 
        Map<Integer, Integer> map = new HashMap(); 
        int count = 0;
        
        map.put(0, 1); 
        
        for(int n: nums){
            sum += n; 
            
            if(map.containsKey(sum - k))
                count += map.get(sum-k); 
                 
            map.put(sum, map.getOrDefault(sum, 0) + 1); 
        }
        
        return count; 
    }
}