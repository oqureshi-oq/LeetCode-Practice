class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums == null) return null; 
        
        Map<Integer, Integer> count = new HashMap(); 
        
        for(int n: nums){
            count.put(n, count.getOrDefault(n,0) + 1);; 
        }
        
        List<Integer>[] freqBucket = new List[nums.length+1]; 
        
        for(int n: count.keySet()){
            if(freqBucket[count.get(n)] == null)
                freqBucket[count.get(n)] = new ArrayList(); 
            freqBucket[count.get(n)].add(n); 
        }
        
        int[] ans = new int[k]; 
        int i = 0;
        for(int j = freqBucket.length-1; j >=0 && i < k; j--){
            if(freqBucket[j] != null){
                for(int l = 0; i < k && l < freqBucket[j].size(); l++){
                    ans[i++] = freqBucket[j].get(l); 
                }
            }
        }
        
        return ans; 
    }
}