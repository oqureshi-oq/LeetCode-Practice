class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums == null || nums.length < k || k <= 0)
            return new int[0];
        
        Map<Integer, Integer> map = new HashMap(); 
        
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0) + 1); 
        }
        
        List<Integer>[] buckets = new List[nums.length+1]; 
        
        for(int n: map.keySet()){
            int count = map.get(n);
            
            if(buckets[count] == null)
                buckets[count] = new ArrayList(); 
            
            buckets[count].add(n);
        }
        
        int[] ans = new int[k]; 
        
        for(int i = buckets.length-1; i > 0 && k > 0; i--){
            if(buckets[i] == null)
                continue; 
            
            for(int j = 0; j < buckets[i].size() && k > 0; j++){
                ans[k-1] = buckets[i].get(j); 
                k--; 
            }
        }
        
        return ans; 
    }
}