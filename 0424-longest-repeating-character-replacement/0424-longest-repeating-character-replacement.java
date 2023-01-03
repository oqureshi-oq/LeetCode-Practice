class Solution {
    public int characterReplacement(String s, int k) {
        if(s == null)
            return 0;
        
        int[] freq = new int[26]; 
        int maxFreq = 0;
        int left = 0;
        int right = 0;
        
        while(right < s.length()){
            char c = s.charAt(right);
            
            freq[c - 'A']++; 
            
            maxFreq = Math.max(maxFreq, freq[c - 'A']); 
            
            if(right - left + 1 - maxFreq > k){
                freq[s.charAt(left) - 'A']--;
                left++; 
            }
            
            right++; 
        }
        
        return right - left; 
    }
}