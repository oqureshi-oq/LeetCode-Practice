class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums == null || k > nums.length)
            return new int[0]; 
        
        HashMap<Integer, Integer> map = new HashMap(); 
        
        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0) + 1); 
        }
        
        ArrayList<Integer>[] arr = new ArrayList[nums.length+1]; 
        
        for(int n: map.keySet()){
            if(arr[map.get(n)] == null)
                arr[map.get(n)] = new ArrayList(); 
            
            arr[map.get(n)].add(n); 
        }
        
        int[] ans = new int[k]; 
        
        for(int i = nums.length; k > 0 && i >= 0; i--){
            if(arr[i] == null)
                continue; 
            
            for(int j = 0; k > 0 && j < arr[i].size(); j++){
                ans[k-1] = arr[i].get(j); 
                k--; 
            }
        }
        
        return ans; 
    }
}