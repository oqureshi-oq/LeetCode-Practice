class Solution {
    public int heightChecker(int[] heights) {
        if(heights == null)
         return -1;
        
        int[] eHeights = new int[101];
        for(int h: heights){
            eHeights[h]++;
        }
        
        int count = 0;
        int eH = 1; 
        
        for(int aH: heights){
            while(eHeights[eH] == 0)
                eH++;
            
            if(aH != eH)
                count++;
            
            eHeights[eH]--;
        }
        
        return count; 
    }
}