class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums == null) return new int[0]; 
        
        Map<Integer, Integer> map = new HashMap(); 
        
        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        List<Integer>[] buckets = new List[nums.length+1]; 
        
        for(int n: map.keySet()){
            int freq = map.get(n); 
            
            if(buckets[freq] == null)
                buckets[freq] = new ArrayList(); 
            
            buckets[freq].add(n); 
        }
        
        int[] ans = new int[k]; 
        int write = ans.length - 1; 
        
        for(int i = buckets.length - 1; write >= 0 && i >= 0; i--){
            List<Integer> list = buckets[i]; 
            
            if(list == null)
                continue; 
            
            for(int j = 0; write >= 0 && j < list.size(); j++){
                ans[write--] = list.get(j); 
            }
        }
        
        return ans; 
    }
}