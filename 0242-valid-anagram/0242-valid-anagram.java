class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null || s.length() != t.length())
            return false; 
        
        int[] map = new int[26]; 
        int n = s.length(); 
        
        for(int i = 0; i < n; i++){
            map[s.charAt(i) - 'a']++;
            map[t.charAt(i) - 'a']--;
        }
        
        for(int x: map){
            if(x != 0)
                return false; 
        }
        
        return true; 
    }
}