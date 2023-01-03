class Solution {
    public int characterReplacement(String s, int k) {
        if(s == null)
            return 0;
        
        Map<Character, Integer> freq = new HashMap(); 
        int maxFreq = 0;
        int left = 0;
        int right = 0;
        
        while(right < s.length()){
            char c = s.charAt(right);
            
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            
            maxFreq = Math.max(maxFreq, freq.get(c)); 
            
            if(right - left + 1 - maxFreq > k){
                freq.put(s.charAt(left), freq.get(s.charAt(left)) - 1); 
                left++; 
            }
            
            right++; 
        }
        
        return right - left; 
    }
}