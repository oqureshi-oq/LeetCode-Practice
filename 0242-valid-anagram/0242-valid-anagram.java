class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null || s.length() != t.length())
            return false; 
        
        int[] letters = new int[26];
        int length = s.length(); 
        
        for(int i = 0; i < length; i++){
            letters[s.charAt(i) - 'a']++;
            letters[t.charAt(i)- 'a']--;
        }
        
        for(int n: letters){
            if(n != 0)
                return false; 
        }
        
        return true; 
    }
}