class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        Map<Integer, Integer> map1 = new HashMap(); 
        Map<Integer, Integer> map2 = new HashMap(); 
        
        int currentNode = node1; 
        int distance = 0;
        
        while(currentNode != -1 && !map1.containsKey(currentNode)){
            map1.put(currentNode, distance);
            
            currentNode = edges[currentNode];
            distance++; 
        }
        
        currentNode = node2; 
        distance = 0; 
        
        while(currentNode != -1 && !map2.containsKey(currentNode)){
            map2.put(currentNode, distance);
            
            currentNode = edges[currentNode];
            distance++; 
        }
        
        int answerNode = -1; 
        
        for(int i = 0; i < edges.length; i++){
            if(map1.containsKey(i) && map2.containsKey(i)){
                int candidateDistance = Math.max(map1.get(i), map2.get(i));
                int currentDistance = Math.max(map1.getOrDefault(answerNode,Integer.MAX_VALUE), map2.getOrDefault(answerNode, Integer.MAX_VALUE));
                
                if(candidateDistance < currentDistance){
                    answerNode = i;
                } else if(candidateDistance == currentDistance && i < answerNode)
                    answerNode = i; 
            }
        }
        
        return answerNode; 
    }
}

//2 -> 0 -> 2