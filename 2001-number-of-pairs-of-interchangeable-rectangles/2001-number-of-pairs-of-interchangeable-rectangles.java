class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        if(rectangles == null)
            return 0; 
        
        Map<Double, Integer> map = new HashMap(); 
        long count = 0; 
        
        for(int i = 0; i < rectangles.length; i++){
            double ratio = Double.valueOf(rectangles[i][0]) / Double.valueOf(rectangles[i][1]); 
            count += map.getOrDefault(ratio, 0); 
            map.put(ratio, map.getOrDefault(ratio, 0) + 1); 
        }
        
        return count; 
    }
}