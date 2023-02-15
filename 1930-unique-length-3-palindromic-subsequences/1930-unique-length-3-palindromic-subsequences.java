class Solution {
    public int countPalindromicSubsequence(String s) {
        if(s == null)
            return 0;
        
        int[] left = new int[26];
        int[] right = new int[26]; 
        
        Arrays.fill(left, s.length());
        Arrays.fill(right, -1); 
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i); 
            
            if(left[c - 'a'] == s.length())
                left[c- 'a'] = i;
            
            right[c - 'a'] = i; 
        }
        
        int count = 0; 
        
        for(int i = 0; i < 26; i++){
            Set<Character> seen = new HashSet(); 
            
            for(int j = left[i]+1; j < right[i]; j++){
                seen.add(s.charAt(j)); 
            }
            
            count += seen.size(); 
        }
        
        return count; 
    }
}