class Solution {
    public int heightChecker(int[] heights) {
        if(heights == null) return -1;
        
        int[] map = new int[101];
        
        for(int h: heights){
            map[h]++; 
        }
        
        int count = 0;
        int expectedHeight = 1; 
        
        for(int i = 0; i < heights.length; i++){
            while(map[expectedHeight] == 0)
                expectedHeight++; 
            
            if(expectedHeight != heights[i])
                count++;
            
            map[expectedHeight]--; 
        }
        
        return count; 
    }
}