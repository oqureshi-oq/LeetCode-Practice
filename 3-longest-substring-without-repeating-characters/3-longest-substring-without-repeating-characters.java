class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null)
            return 0;
        
        Set<Character> seen = new HashSet(); 
        int max = 0;
        
        int left = 0;
        int right = 0; 
        
        while(right < s.length()){
            while(seen.contains(s.charAt(right)))
                seen.remove(s.charAt(left++));
            
            seen.add(s.charAt(right)); 
            
            max = Math.max(right - left + 1, max); 
            
            right++; 
        }
        
        return max; 
    }
}