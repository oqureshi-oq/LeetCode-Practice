class Solution {
    public int countPalindromicSubsequence(String s) {
        if(s == null)
            return 0;
        
        int[] start = new int[26];
        int[] end = new int[26]; 
        Arrays.fill(start, -1);
        Arrays.fill(end, -1); 
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i); 
            if(start[c - 'a'] == -1)
                start[c - 'a'] = i; 
            end[c - 'a'] = i; 
        }
        
        int count = 0; 
        
        for(int i = 0; i < 26; i++){
            if(start[i] == -1)
                continue; 
            
            Set<Character> uniqueChars = new HashSet(); 
            
            for(int j = start[i] + 1; j < end[i]; j++){
                uniqueChars.add(s.charAt(j));
            }
            
            count += uniqueChars.size(); 
        }
        
        return count; 
    }
}