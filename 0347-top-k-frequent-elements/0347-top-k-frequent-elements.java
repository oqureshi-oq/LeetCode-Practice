class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums == null || k > nums.length)
            return new int[0];
        
        Map<Integer, Integer> map = new HashMap(); 
        
        for(int n:nums){
            map.put(n, map.getOrDefault(n,0)+1); 
        }
        
        List[] list = new List[nums.length+1]; 
        
        for(int n: map.keySet()){
            if(list[map.get(n)] == null)
                list[map.get(n)] = new ArrayList(); 
            list[map.get(n)].add(n); 
        }
        
        int[] ans = new int[k];
        k--;
        int i = list.length-1; 
        
        while(k >= 0 && i >= 0){
            
            for(int j = 0; k >= 0 && list[i] != null && j < list[i].size(); j++){
                ans[k--] = (int) list[i].get(j); 
            }
            
            i--; 
        }
        
        return ans; 
    }
}