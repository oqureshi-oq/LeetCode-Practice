class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null || s.length() != t.length())
            return false; 
        
        int[] counts = new int[26]; 
        int n = s.length(); 
        
        for(int i = 0; i < n; i++){
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        
        for(int c: counts){
            if(c != 0)
                return false; 
        }
        
        return true; 
    }
}