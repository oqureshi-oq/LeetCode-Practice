class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> mapPS = new HashMap(); 
        Map<String, Character> mapSP = new HashMap();
        
        int i = 0; 
        int j = 0; 
        
        while(i < pattern.length() && j < s.length()){
            char c = pattern.charAt(i); 
            
            int begin = j; 
            
            while(j < s.length() && s.charAt(j) != ' '){
                j++; 
            }
            
            String word = s.substring(begin, j); 
            
            if(mapPS.containsKey(c) && !mapPS.get(c).equals(word))
                return false; 
            
            if(mapSP.containsKey(word) && mapSP.get(word) != c)
                return false; 
            
            mapPS.put(c, word);
            mapSP.put(word, c); 
            
            i++; 
            j++; 
        }
        
        return i == pattern.length() && j > s.length(); 
    }
}