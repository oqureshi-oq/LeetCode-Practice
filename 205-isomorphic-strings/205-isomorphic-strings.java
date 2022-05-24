class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null) return false; 
        if(s.length() != t.length()) return false; 
        
        int[] mapStoT = new int[256]; 
        Arrays.fill(mapStoT, -1); 
        int[] mapTtoS = new int[256]; 
        Arrays.fill(mapTtoS, -1); 
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            char d = t.charAt(i); 
            
            if(mapStoT[c] == -1 && mapTtoS[d] == -1){
                mapStoT[c] = d;
                mapTtoS[d] = c; 
            } else if(mapStoT[c] != d || mapTtoS[d] != c)
                return false; 
        }
        
        return true; 
    }
}