class Solution {
    public int characterReplacement(String s, int k) {
        if(s == null)
            return 0; 
        
        Set<Character> set = new HashSet(); 
        int max = 0; 
        
        for(int i = 0; i < s.length(); i++){
            set.add(s.charAt(i)); 
        }
        
        for(char c: set){
            int left = 0; 
            int right = 0; 
            int currentMax = 0; 
            int currentK = k; 
            
            while(right < s.length()){
                if(s.charAt(right) != c)
                    currentK--; 
                
                while(currentK < 0){
                    if(s.charAt(left++) != c)
                        currentK++; 
                }
                
                currentMax = Math.max(currentMax, right - left + 1); 
                right++; 
            }
            
            max = Math.max(currentMax, max); 
        }
        
        return max; 
    }
}