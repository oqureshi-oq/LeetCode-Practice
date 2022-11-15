class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(pattern == null || s == null)
            return false; 
        
        int i = 0; 
        int j = 0; 
        Map<Character, String> mapFoward = new HashMap(); 
        Map<String, Character> mapBackward = new HashMap(); 
        
        while(i < pattern.length() && j < s.length()){
            int begin = j; 
            
            while(j < s.length() && s.charAt(j) != ' ')
                j++;
            
            char key = pattern.charAt(i); 
            String value = s.substring(begin, j); 
            
            if(mapFoward.containsKey(key) && !mapFoward.get(key).equals(value))
                return false; 
            
            if(mapBackward.containsKey(value) && 
               mapBackward.get(value) != key)
                return false; 
            
            mapFoward.put(key, value);
            mapBackward.put(value, key);
            
            i++; 
            j++; 
        }
        
        return i == pattern.length() && j >= s.length(); 
    }
}