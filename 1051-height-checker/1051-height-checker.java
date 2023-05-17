class Solution {
    public int heightChecker(int[] heights) {
        if(heights == null)
            return -1;
        
        int[] expected = new int[101];
        for(int h: heights){
            expected[h]++; 
        }
    
        int count = 0;
        int eH = 1; 
        
        for(int aH: heights){
            while(expected[eH] == 0)
                eH++;
            
            if(aH != eH)
                count++;
            
            expected[eH]--;
        }
        
        return count; 
    }
}