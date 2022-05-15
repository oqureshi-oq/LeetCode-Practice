class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null || s.length() != t.length()) 
            return false; 
        
        Map<Character, Character> StoT = new HashMap(); 
        Map<Character, Character> TtoS = new HashMap(); 
        
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i); 
            char tChar = t.charAt(i); 
            if(StoT.containsKey(sChar) && StoT.get(sChar) == tChar && TtoS.containsKey(tChar) && TtoS.get(tChar) == sChar)
                continue; 
            else if(!StoT.containsKey(sChar) && !TtoS.containsKey(tChar)){
                StoT.put(sChar, tChar);
                TtoS.put(tChar, sChar); 
            } else {
                return false; 
            }
        }
        
        return true; 
    }
}