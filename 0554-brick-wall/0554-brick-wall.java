class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        if(wall == null)
            return 0;
        
        Map<Integer, Integer> map = new HashMap(); 
        
        for(int i = 0; i < wall.size(); i++){
            if(wall.get(i) == null)
                return 0; 
            
            int edgeAccumulator = 0;
            
            for(int j = 0; j < wall.get(i).size()-1; j++){
                edgeAccumulator += wall.get(i).get(j); 
                map.put(edgeAccumulator, map.getOrDefault(edgeAccumulator,0) + 1); 
            }
             
        }
        
        int max = 0; 
        
        for(int edge: map.keySet()){
            max = Math.max(max, map.get(edge));
        }
        
        return wall.size()-max; 
    }
}