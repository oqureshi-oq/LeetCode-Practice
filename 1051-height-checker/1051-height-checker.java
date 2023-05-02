class Solution {
    public int heightChecker(int[] heights) {
        if(heights == null)
            return -1;
        
        int[] eH = new int[101];
        
        for(int h: heights){
            eH[h]++; 
        }
        
        int count = 0;
        int expected = 1;
        
        for(int actual: heights){
            while(eH[expected] == 0)
                expected++;
            
            if(actual != expected)
                count++;
            
            eH[expected]--; 
        }
        
        return count; 
    }
}