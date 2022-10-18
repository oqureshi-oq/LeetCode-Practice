class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null || s.length() != t.length())
            return false;
        
        return transformString(s).compareTo(transformString(t)) == 0; 
    }
    
    public String transformString(String s){
        if(s == null)
            return new String(); 
        
        Map<Character, Integer> map = new HashMap(); 
        StringBuilder str = new StringBuilder(); 
        
        for(int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), i); 
            
            str.append(map.get(s.charAt(i))); 
            str.append(' '); 
        }

        return str.toString(); 
    }
}