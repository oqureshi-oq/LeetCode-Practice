class Solution {
    public int heightChecker(int[] heights) {
        if(heights == null) return -1; 
        
        int[] hMap = new int[101]; 
        for(int n: heights){
            hMap[n]++; 
        }
        
        int count = 0; 
        for(int i = 0, h = 0; i < heights.length; i++){
            while(hMap[h] == 0) h++; 
            
            if(heights[i] != h) count++; 
            
            hMap[h]--; 
        }
        
        return count; 
    }
}