class Solution {
    public int heightChecker(int[] heights) {
        if(heights == null)
            return 0;
        
        int[] expected = new int[101];
        for(int h: heights){
            expected[h]++;
        }
        
        int count = 0; 
        int h = 1;
        
        for(int aH: heights){
            while(expected[h] == 0)
                h++;
            
            if(h != aH)
                count++;
            
            expected[h]--; 
        }
        
        return count; 
    }
}