class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null) return false; 
        return transformString(s).compareTo(transformString(t)) == 0; 
    }
    
    public String transformString(String s){
        if(s == null || s.length() == 0) return s; 
 
        Map<Character, Integer> map = new HashMap(); 
        StringBuilder str = new StringBuilder(); 
        
        for(int i = 0; i < s.length(); i++){
            char c =s.charAt(i); 
            
            if(!map.containsKey(c))
                map.put(c, i); 
            
            str.append(map.get(c) + " "); 
        }
        
        return str.toString(); 
    }
}