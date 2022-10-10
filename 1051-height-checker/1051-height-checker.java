class Solution {
    public int heightChecker(int[] heights) {
        if(heights == null)
            return -1; 
        
        int[] freqMap = new int[101]; 
        
        for(int h: heights){
            freqMap[h]++; 
        }
        
        int count = 0;
        int expectedHeight = 1; 
        
        for(int actualHeight: heights){
            while(freqMap[expectedHeight] == 0)
                expectedHeight++; 
            
            if(actualHeight != expectedHeight)
                count++;
            
            freqMap[expectedHeight]--; 
        }
        
        return count; 
    }
}