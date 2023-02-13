class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s == null || t == null || s.length() > t.length())
            return false; 
        
        int sP = 0;
        int tP = 0;
        
        while(sP < s.length()){
            char c = s.charAt(sP); 
            
            while(tP < t.length() && t.charAt(tP) != c)
                tP++; 
            
            if(tP == t.length())
                return false; 
            
            tP++; 
            sP++; 
        }
        
        return true; 
    }
}