class Solution {
    public int characterReplacement(String s, int k) {
        if(s == null)
            return 0; 
        
        int left = 0;
        int right = 0;
        int[] map = new int[26]; 
        int maxFreq = 0; 
        int max = 0; 
        
        while(right < s.length()){
            map[s.charAt(right) - 'A']++; 
            maxFreq = Math.max(maxFreq, map[s.charAt(right) - 'A']); 
            
            while(right-left+1 - maxFreq > k){
                map[s.charAt(left++) - 'A']--; 
            }
            
            max = Math.max(right-left+1, max); 
            
            right++;
        }
        
        return max; 
    }
}