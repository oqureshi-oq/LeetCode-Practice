class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        if(wall == null)
            return -1;
        
        Map<Integer, Integer> map = new HashMap(); 
        
        for(int i = 0; i < wall.size(); i++){
            int sum = 0; 
            
            for(int j = 0; j < wall.get(i).size(); j++){
                sum += wall.get(i).get(j);
                map.put(sum, map.getOrDefault(sum, 0) + 1); 
            }
            
            map.put(sum, 0); 
        }
        
        int count = wall.size(); 
        
        for(int n: map.keySet()){
            count = Math.min(count, wall.size() - map.get(n)); 
        }
        
        return count; 
    }
}