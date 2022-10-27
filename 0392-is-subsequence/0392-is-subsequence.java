class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s == null || t == null || s.length() > t.length())
            return false; 
        
        int i = 0; 
        int j = 0; 
        
        while(i < s.length() && j < t.length()){
            while(j < t.length() && s.charAt(i) != t.charAt(j))
                j++; 
            
            if(j < t.length() && s.charAt(i) == t.charAt(j)){
                i++; 
                j++; 
            }
        }
        
        return i == s.length(); 
    }
}