class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<Double, Integer> map = new HashMap(); 
        
        for(int i = 0; i < rectangles.length; i++){
            double ratio = (double) rectangles[i][0] / rectangles[i][1]; 
            map.put(ratio, map.getOrDefault(ratio, 0) + 1); 
        }
        
        long count = 0; 
        
        for(double n: map.keySet()){
            double total = map.get(n); 
            count += (total * (total-1))/2; 
        }
        
        return count; 
    }
}