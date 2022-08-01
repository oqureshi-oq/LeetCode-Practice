class Solution {
    public int characterReplacement(String s, int k) {
        if(s == null)
            return 0; 
        
        int left = 0;
        int right = 0; 
        Map<Character, Integer> map = new HashMap(); 
        int mostFrequentCharacterCount = 0; 
        int max = 0; 
        
        while(right < s.length()){
            char currentChar = s.charAt(right);
            
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
            mostFrequentCharacterCount = Math.max(mostFrequentCharacterCount,
                                                  map.get(currentChar));
            
            while(right-left+1 - mostFrequentCharacterCount > k){
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1); 
                left++; 
            }
            
            max = Math.max(max, right-left+1); 
            right++; 
        }
        
        return max; 
    }
}