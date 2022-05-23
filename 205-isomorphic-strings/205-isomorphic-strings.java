class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null) return false; 
        return transformString(s).compareTo(transformString(t)) == 0; 
    }
    
    public String transformString(String s){
        StringBuilder transformedString = new StringBuilder(); 
        Map<Character, Integer> map = new HashMap(); 
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!map.containsKey(c))
                map.put(c, i); 
            transformedString.append(map.get(c));
            transformedString.append(' '); 
        }
        
        return transformedString.toString(); 
    }
}