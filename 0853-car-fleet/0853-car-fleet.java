class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer,Integer> map = new HashMap(); 
        
        for(int i = 0; i < position.length; i++){
            map.put(position[i], speed[i]); 
        }
        
        int[] sortedPositions = new int[position.length];
        int i = 0; 
        
        for(int n: map.keySet()){
            sortedPositions[i++] = n; 
        }
        
        Arrays.sort(sortedPositions); 
        
        Deque<Integer> stack = new ArrayDeque(); 
        
        for(int j = 0; j < sortedPositions.length; j++){
            while(!stack.isEmpty()){
                int p1 = stack.peek(); 
                int s1 = map.get(p1); 
                int p2 = sortedPositions[j];
                int s2 = map.get(p2); 
                
                if(s1 - s2 != 0){
                    double intersectionTime = (p2 - p1) / ((double)s1 - s2);
                    double intersectionPosition = p1 + s1 * intersectionTime; 
                    
                    if(intersectionTime > 0 && 
                       target >= intersectionPosition && intersectionPosition >= p2)
                        stack.pop(); 
                    else
                        break; 
                } else {
                    break; 
                }
            } 
            
            stack.push(sortedPositions[j]); 
        }
        
        return stack.size(); 
    }
}