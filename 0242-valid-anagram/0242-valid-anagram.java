class Solution {
    int NUMBER_OF_LETTERS = 26; 
    
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null || s.length() != t.length())
            return false; 
        
        int[] lettersFreq = new int[NUMBER_OF_LETTERS];
        int length = s.length(); 
        
        for(int i = 0; i < length; i++){
            lettersFreq[s.charAt(i) - 'a']++;
            lettersFreq[t.charAt(i) - 'a']--;
        }
        
        for(int n: lettersFreq){
            if(n != 0)
                return false; 
        }
        
        return true; 
    }
}