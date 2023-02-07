class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1 == null || s2 == null || s1.length() > s2.length())
            return false; 
        
        int[] letters1 = new int[26];  
        
        for(int i = 0; i < s1.length(); i++){
            char c = s1.charAt(i); 
            letters1[c - 'a']++;  
        }
        
        int[] letters2 = new int[26];   
        int count = 0;
        int left = 0;
        int right = 0;
        
        while(right < s2.length()){
            char c = s2.charAt(right); 
            
            letters2[c - 'a']++; 
            
            while(letters2[c - 'a'] > letters1[c - 'a']){
                letters2[s2.charAt(left) - 'a']--; 
                left++; 
            }
            
            if(right - left + 1 == s1.length())
                return true; 
            
            right++; 
        }
        
        return false; 
    }
}