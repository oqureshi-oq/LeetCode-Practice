class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null)
            return 0;
        
        Set<Character> seen = new HashSet(); 
        int maxLength = 0;
        
        for(int left = 0, right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            
            while(seen.contains(c))
                seen.remove(s.charAt(left++)); 
            
            seen.add(c); 
            
            maxLength = Math.max(maxLength, right - left + 1); 
        }
        
        return maxLength; 
    }
}