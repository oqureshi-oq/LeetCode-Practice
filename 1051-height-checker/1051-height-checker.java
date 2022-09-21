class Solution {
    public int heightChecker(int[] heights) {
        if(heights == null)
            return -1; 
        
        int[] freq = new int[101];
        
        for(int h: heights){
            freq[h]++; 
        }
        
        int count = 0; 
        int expectedHeight = 0; 
        
        for(int actualHeight: heights){
            while(freq[expectedHeight] == 0)
                expectedHeight++; 
            
            if(actualHeight != expectedHeight)
                count++; 
            
            freq[expectedHeight]--; 
        }
        
        return count; 
    }
}