class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null) return 0;
        
        Set<Character> seen = new HashSet(); 
        int max = 0; 
        for(int i = 0, j = 0; j < s.length(); j++){
            char c = s.charAt(j);
            
            while(seen.contains(c)){
                seen.remove(s.charAt(i++)); 
            }
            
            seen.add(c); 
            
            max = Math.max(max, j - i + 1); 
        }
        
        return max; 
    }
}