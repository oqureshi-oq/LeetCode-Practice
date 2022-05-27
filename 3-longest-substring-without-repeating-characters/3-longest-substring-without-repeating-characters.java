class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null) return 0; 
        
        Set<Character> seen = new HashSet(); 
        int max = 0; 
        
        for(int left = 0, right = 0; right < s.length(); right++){
            while(seen.contains(s.charAt(right)))
                seen.remove(s.charAt(left++)); 
            
            seen.add(s.charAt(right)); 
            
            max = Math.max(right - left + 1, max); 
        }
        
        return max; 
    }
}