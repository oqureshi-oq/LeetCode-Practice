class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(pattern == null || s == null)
            return false; 
        
        Map<Character, String> mapPS = new HashMap(); 
        Map<String, Character> mapSP = new HashMap();
        
        int pP = 0;
        int sP = 0; 
        
        while(pP < pattern.length() && sP < s.length()){
            char c = pattern.charAt(pP); 
            StringBuilder sb = new StringBuilder(); 
            
            while(sP < s.length() && s.charAt(sP) != ' ')
                sb.append(s.charAt(sP++));
            
            String word = sb.toString(); 
            
            if(mapPS.containsKey(c) && !mapPS.get(c).equals(word))
                return false; 
            
            if(mapSP.containsKey(word) && mapSP.get(word) != c)
                return false; 
            
            mapPS.put(c, word);
            mapSP.put(word, c); 
            
            sP++;
            pP++; 
        }
        
        return pP == pattern.length() && sP > s.length(); 
    }
}