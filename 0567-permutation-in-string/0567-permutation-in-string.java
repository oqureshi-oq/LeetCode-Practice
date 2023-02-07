class Solution {
    final int NUMBER_OF_LETTERS = 26; 
    
    public boolean checkInclusion(String s1, String s2) {
        if(s1 == null || s2 == null || s1.length() > s2.length())
            return false; 
        
        int[] letters1 = new int[NUMBER_OF_LETTERS];
        
        for(int i = 0; i < s1.length(); i++){
            letters1[s1.charAt(i) - 'a']++; 
        }
        
        int left = 0;
        int right = 0;
        int[] letters2 = new int[NUMBER_OF_LETTERS]; 
        
        while(right < s2.length()){
            char c = s2.charAt(right);
            
            letters2[c - 'a']++;
            
            while(letters2[c - 'a'] > letters1[c - 'a'])
                letters2[s2.charAt(left++) - 'a']--; 
            
            if(right - left + 1 == s1.length())
                return true;
            
            right++; 
        }
        
        return false; 
    }
}