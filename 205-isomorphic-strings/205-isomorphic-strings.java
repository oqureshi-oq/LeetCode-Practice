class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null) return false; 
        return transformString(s).compareTo(transformString(t)) == 0; 
    }
    
    public String transformString(String str){
        if(str == null || str.length() == 0) return str;
        
        Map<Character, Character> map = new HashMap(); 
        StringBuilder transformedString = new StringBuilder(); 
        
        for(int i = 0; i < str.length(); i++){
            if(!map.containsKey(str.charAt(i)))
                map.put(str.charAt(i), (char)i); 
            transformedString.append(map.get(str.charAt(i))); 
        }
        
        return transformedString.toString(); 
    }
}