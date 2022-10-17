class Solution {
    public int heightChecker(int[] heights) {
        if(heights == null) 
            return -1;
        
        int[] freq = new int[101]; 
        
        for(int h: heights){
            freq[h]++; 
        }
        
        int count = 0; 
        int expectedHeight = 1; 
        
        for(int i = 0; i < heights.length; i++){
            while(freq[expectedHeight] == 0)
                expectedHeight++; 
            
            if(heights[i] != expectedHeight)
                count++; 
            
            freq[expectedHeight]--; 
        }
        
        return count; 
    }
}