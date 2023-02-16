class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<Double, Integer> map = new HashMap(); 
        long count = 0; 
        
        for(int i = 0; i < rectangles.length; i++){
            double ratio = (double) rectangles[i][0] / rectangles[i][1];
            int initialAmount = map.getOrDefault(ratio, 0); 
            map.put(ratio, initialAmount + 1); 
            count += initialAmount; 
        }
        
        return count; 
    }
}