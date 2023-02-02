class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null)
            return new ArrayList(); 
        
        Set<List<Integer>> ans = new HashSet(); 
        Map<Integer, Integer> map = new HashMap();
        Set<Integer> seen = new HashSet(); 
        
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i); 
        }
        
        for(int i = 0; i < nums.length; i++){
            if(!seen.add(nums[i]))
                continue; 
            
            for(int j = i+1; j < nums.length; j++){               
                int sum = nums[i] + nums[j]; 
                
                if(map.containsKey(-sum) && j < map.get(-sum)){
                    List<Integer> list = new ArrayList(); 
                    
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(-sum); 
                    
                    Collections.sort(list); 
                    
                    ans.add(list); 
                }                
            }
        }
        
        return new ArrayList(ans); 
    }
}