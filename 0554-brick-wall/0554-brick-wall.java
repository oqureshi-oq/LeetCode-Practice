class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        if(wall == null)
            return 0;
        
        Map<Integer, Integer> map = new HashMap(); 
        
        for(int i = 0; i < wall.size(); i++){
            int edgeAccumulator = 0;
            for(int j = 0; j < wall.get(i).size(); j++){
                edgeAccumulator += wall.get(i).get(j); 
                map.put(edgeAccumulator, map.getOrDefault(edgeAccumulator,0) + 1); 
            }
            map.put(edgeAccumulator, 0); 
        }
        
        Integer max = null; 
        
        for(int edge: map.keySet()){
            int numEdgesCrossed = map.get(edge); 
            if(max == null || numEdgesCrossed > max)
                max = numEdgesCrossed; 
        }
        
        return wall.size()-max; 
    }
}