class Solution {
    public int heightChecker(int[] heights) {
        if(heights == null)
            return -1; 
        
        int[] expectedHeights = new int[101]; 
        
        for(int h: heights){
            expectedHeights[h]++; 
        }
        
        int count = 0;
        int eH = 1; 
        
        for(int h: heights){
            while(expectedHeights[eH] == 0)
                eH++;
            
            if(eH != h)
                count++;
            
            expectedHeights[eH]--; 
        }
        
        return count; 
    }
}