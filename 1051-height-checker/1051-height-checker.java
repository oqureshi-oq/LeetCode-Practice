class Solution {
    public int heightChecker(int[] heights) {
        if(heights == null) return -1;
        
        int[] freq = new int[101];
        
        for(int h: heights){
            freq[h]++; 
        }
        
        int count = 0;
        int expected = 1;
        
        for(int actual: heights){
            while(freq[expected] == 0)
                expected++; 
            
            if(actual != expected)
                count++;
            
            freq[expected]--; 
        }
        
        return count; 
    }
}