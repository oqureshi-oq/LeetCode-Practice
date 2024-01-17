class Solution {
    public int heightChecker(int[] heights) {
        if(heights == null)
            return 0;
        
        int[] expected = new int[101];
        
        for(int h: heights){
            expected[h]++; 
        }
        
        int eH = 1; 
        int count = 0;
        
        for(int aH: heights){
            while(expected[eH] == 0)
                eH++;
            
            if(eH != aH)
                count++;
            
            expected[eH]--; 
        }
        
        return count; 
    }
}