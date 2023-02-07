class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null)
            return 0;
        
        int left = 0;
        int right = 0;
        Set<Character> seen = new HashSet(); 
        int max = 0;
        
        while(right < s.length()){
            char c = s.charAt(right);
            
            while(seen.contains(c))
                seen.remove(s.charAt(left++)); 
            
            seen.add(c); 
            
            max = Math.max(max, right - left + 1);
            
            right++; 
        }
        
        return max; 
    }
}