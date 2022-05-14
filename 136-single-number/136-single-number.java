class Solution {
    public int singleNumber(int[] nums) {
        if(nums == null) return 0; 
        
        Map<Integer, Integer> map = new HashMap(); 
        
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1); 
        }
        
        for(Map.Entry entry: map.entrySet()){
            if((int)entry.getValue() == 1) return (int) entry.getKey(); 
        }
        
        return 0; 
    }
}