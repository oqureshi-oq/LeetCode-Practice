class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums == null) return null;
        
        Map<Integer, Integer> map = new HashMap(); 
        
        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0) + 1); 
        }
        
        ArrayList<Integer>[] frequency = new ArrayList[nums.length+1]; 
        
        for(int n: map.keySet()){
            int index = map.get(n); 
            
            if(frequency[index] == null)
                frequency[index] = new ArrayList(); 
            
            frequency[index].add(n); 
        }
        
        int[] ans = new int[k];
        
        for(int i = frequency.length-1, j = 0; j < k && i >= 0; i--){
            if(frequency[i] == null) continue; 
            
            for(int l = 0; j < k && l < frequency[i].size(); l++)
                ans[j++] = frequency[i].get(l); 
        }
        
        return ans; 
    }
}