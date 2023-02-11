class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        // map initial position to speed
        Map<Integer, Integer> map = new HashMap(); 
        
        for(int i = 0; i < position.length; i++){
            map.put(position[i], speed[i]); 
        }
        
        // sort the key set  
        int[] sortedMap = new int[map.size()]; 
        
        int i = 0; 
        for(int p: map.keySet()){
            sortedMap[i++] = p;  
        }
        
        Arrays.sort(sortedMap); 
        
        // 
        Deque<Integer> stack = new ArrayDeque(); 
        
        for(int j = 0; j < sortedMap.length; j++){
            while(!stack.isEmpty()){
                int p1 = sortedMap[stack.peek()];
                int s1 = map.get(p1); 
                int p2 = sortedMap[j];
                int s2 = map.get(p2); 
                
                double intersectionTime = (p2 - p1) / (1.0 * s1 - s2); 
                
                if(intersectionTime < 0)
                    break; 
                
                double intersectionPosition = p1 + s1 * intersectionTime; 
                
                if(p2 < intersectionPosition && intersectionPosition <= target)
                    stack.pop();  
                else
                    break; 
            }
            
            stack.push(j); 
        }
        
        return stack.size(); 
    }
}