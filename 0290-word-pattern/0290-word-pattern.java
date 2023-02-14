class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(pattern == null || s == null)
            return false; 
        
        Map<Character, String> map = new HashMap(); 
        Map<String, Character> reverseMap = new HashMap(); 
        int j = 0; 
        int i = 0; 
        for(i = 0; i < pattern.length() && j < s.length(); i++){
            char c = pattern.charAt(i);
            StringBuilder sb = new StringBuilder(); 
            
            while(j < s.length() && s.charAt(j) != ' '){
                 sb.append(s.charAt(j++)); 
            }
                    
            String word = sb.toString(); 
            
            j++; 
            
            if(map.containsKey(c) && !map.get(c).equals(word))
                return false;
            
            if(reverseMap.containsKey(word) && reverseMap.get(word) != c)
                return false;
            
            map.put(c, word); 
            reverseMap.put(word, c);
        }
        
        return i == pattern.length() && j > s.length();  
    }
}