class Solution {
    public int maxFrequencyElements(int[] nums) {
        if(nums == null)
            return 0;
        
        Map<Integer, Integer> freqMap = new HashMap(); 
        int max = 0; 
        
        for(int n: nums){
            freqMap.put(n, freqMap.getOrDefault(n,0) + 1);
            max = Math.max(max, freqMap.get(n));
        }
        
        int count = 0; 
        
        for(int key: freqMap.keySet()){
            if(max == freqMap.get(key))
                count += max; 
        }
        
        return count; 
    }
}