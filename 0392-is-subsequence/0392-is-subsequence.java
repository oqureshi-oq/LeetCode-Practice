class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s == null || t == null)
            return false; 
        
        int sIter = 0;
        int tIter = 0;
        
        while(sIter < s.length() && tIter < t.length()){
            char c = s.charAt(sIter); 
            
            while(tIter < t.length() && t.charAt(tIter) != c)
                tIter++; 
            
            if(tIter < t.length() && t.charAt(tIter) == c){
                sIter++; 
                tIter++; 
            }
        }
        
        return sIter == s.length(); 
    }
}