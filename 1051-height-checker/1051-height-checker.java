/*
 * Time: O(n+k) where n is number of elements and k is the range of the elements
 * Space: O(n+k)
 */ 
class Solution {
    public int heightChecker(int[] heights) {
        if(heights == null)
            return 0;
        
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