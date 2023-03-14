class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null || s.length() != t.length())
            return false; 
        
        int[] sMapT = new int[256];
        int[] tMapS = new int[256]; 
        Arrays.fill(sMapT, -1);
        Arrays.fill(tMapS, -1); 
        
        for(int i = 0; i < s.length(); i++){
            if(sMapT[s.charAt(i)] != -1 && 
               sMapT[s.charAt(i)] != t.charAt(i))
                return false; 
            
            if(tMapS[t.charAt(i)] != -1 && 
               tMapS[t.charAt(i)] != s.charAt(i))
                return false; 
            
            
            sMapT[s.charAt(i)] = t.charAt(i);
            tMapS[t.charAt(i)] = s.charAt(i); 
        }
        
        return true; 
    }
}