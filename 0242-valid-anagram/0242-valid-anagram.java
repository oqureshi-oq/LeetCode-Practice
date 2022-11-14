class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null || s.length() != t.length())
            return false;
        
        Map<Character, Integer> map = new HashMap(); 
        int n = s.length(); 
        
        for(int i = 0; i < n; i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i); 
            
            map.put(sChar, map.getOrDefault(sChar, 0) + 1);
            map.put(tChar, map.getOrDefault(tChar, 0) - 1); 
        }
        
        for(char c: map.keySet()){
            if(map.get(c) != 0)
                return false; 
        }
        
        return true; 
    }
}