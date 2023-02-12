class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights == null)
            return 0;
        
        int[] lessFromLeft = new int[heights.length];
        int[] lessFromRight = new int[heights.length];
        int maxArea = 0;
        
        lessFromLeft[0] = 0;
        
        for(int i = 1; i < heights.length; i++){
            int p = i; 
            
            while(p > 0 && heights[p-1] >= heights[i])
                p = lessFromLeft[p-1];
            
            lessFromLeft[i] = p ;
        }
        
        lessFromRight[heights.length-1] = heights.length-1;
        
        for(int i = heights.length-2; i >= 0; i--){
            int p = i; 
            
            while(p < heights.length-1 && heights[i] <= heights[p+1])
                p = lessFromRight[p+1];
            
            lessFromRight[i] = p; 
        }
        
        for(int i = 0; i < heights.length; i++){
            int area = heights[i] * (lessFromRight[i] - lessFromLeft[i] + 1); 
            maxArea = Math.max(maxArea, area); 
        }
        
        return maxArea; 
    }
}