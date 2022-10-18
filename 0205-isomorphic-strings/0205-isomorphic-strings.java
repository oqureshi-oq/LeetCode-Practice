class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null || s.length() != t.length())
            return false; 
        
        Map<Character, Character> map = new HashMap(); 
        Set<Character> mapped = new HashSet(); 
        
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i)) 
               && map.get(s.charAt(i)) != t.charAt(i))
                return false; 
            else if(!map.containsKey(s.charAt(i)) && mapped.contains(t.charAt(i))) 
                return false; 
            else {
                map.put(s.charAt(i), t.charAt(i));
                mapped.add(t.charAt(i)); 
            } 
        }
        
        return true; 
    }
}