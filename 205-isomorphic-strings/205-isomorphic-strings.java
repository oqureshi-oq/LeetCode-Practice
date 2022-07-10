class Solution {
    public boolean isIsomorphic(String s, String t) {
        return transformString(s).equals(transformString(t)); 
    }
    
    public String transformString(String s){
        if(s == null) return new String(); 
        
        StringBuilder str = new StringBuilder(); 
        Map<Character, Integer> map = new HashMap(); 
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i); 
            
            if(!map.containsKey(c))
                map.put(c, i); 
            
            str.append(map.get(c) + ' '); 
        }
        
        return str.toString(); 
    }
}