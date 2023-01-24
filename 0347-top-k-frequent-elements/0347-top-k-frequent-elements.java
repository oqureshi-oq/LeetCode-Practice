class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums == null || k <=0 || k > nums.length)
            return new int[0];
        
        Map<Integer, Integer> freq = new HashMap(); 
        
        for(int n: nums){
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        
        List[] buckets = new List[nums.length+1]; 
        
        for(int n: freq.keySet()){
            int count = freq.get(n);
            
            if(buckets[count] == null)
                buckets[count] = new ArrayList<Integer>(); 
            
            buckets[count].add(n);
        }
        
        int[] ans = new int[k];
        
        for(int i = buckets.length-1; k > 0 && i >= 0; i--){
            if(buckets[i] == null)
                continue; 
            
            for(int j = 0; k > 0 && j < buckets[i].size(); j++){
                ans[k-1] = (int) buckets[i].get(j);
                k--; 
            }
        }
        
        return ans; 
    }
}