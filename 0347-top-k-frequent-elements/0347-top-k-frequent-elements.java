class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums == null)
            return new int[0];
        
        Map<Integer, Integer> counts = new HashMap(); 
        
        for(int n: nums){
            counts.put(n, counts.getOrDefault(n, 0) + 1); 
        }
        
        List<Integer>[] buckets = new List[nums.length+1]; 
        
        for(int n: counts.keySet()){
            int count = counts.get(n);
            
            if(buckets[count] == null)
                buckets[count] = new ArrayList(); 
            
            buckets[count].add(n); 
        }
        
        int[] ans = new int[k]; 
        
        for(int i = buckets.length-1; k > 0 && i >= 0; i--){
            if(buckets[i] == null)
                continue;
            
            for(int j = 0; k > 0 && j < buckets[i].size(); j++){
                ans[k-1] = buckets[i].get(j); 
                k--; 
            }
        }
        
        return ans; 
    }
}