class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums == null)
            return null;
        
        Map<Integer, Integer> map = new HashMap(); 
        
        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        
        List<Integer>[] buckets = new List[nums.length+1];
        
        for(int key: map.keySet()){
            int count = map.get(key);
            
            if(buckets[count] == null)
                buckets[count] = new ArrayList(); 
            
            buckets[count].add(key);
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