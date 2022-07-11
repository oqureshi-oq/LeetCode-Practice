class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums == null) return new int[0];
        
        Map<Integer, Integer> map = new HashMap(); 
        
        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0) + 1); 
        }
        
        List<Integer>[] bucket = new List[nums.length+1];
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(bucket[entry.getValue()] == null)
                bucket[entry.getValue()] = new ArrayList(); 
            
            bucket[entry.getValue()].add(entry.getKey()); 
        }
        
        int[] ans = new int[k]; 
        for(int i = 0, j = nums.length; i < k && j >= 0; j--){
            if(bucket[j] == null) continue; 
            for(int l = 0; i < k && l < bucket[j].size(); l++){
                ans[i++] = bucket[j].get(l); 
            }
        }
        
        return ans; 
    }
}