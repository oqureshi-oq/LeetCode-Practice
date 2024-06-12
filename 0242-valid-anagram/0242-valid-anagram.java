class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null || s.length() != t.length())
            return false; 
        
        int[] freqMap = new int[26];
        int n = s.length(); 
        
        for(int i = 0; i < n; i++){
            freqMap[s.charAt(i) - 'a']++;
            freqMap[t.charAt(i) - 'a']--;
        }
        
        for(int f: freqMap){
            if(f != 0)
                return false; 
        }
        
        return true; 
    }
}