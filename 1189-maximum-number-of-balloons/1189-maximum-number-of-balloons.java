class Solution {
    public int maxNumberOfBalloons(String text) {
        return maxNumberOfWords(text, "balloon");
    }
    
    private int maxNumberOfWords(String text, String word){
        if(text == null)
            return 0; 
        
        Map<Character, Integer> textMap = new HashMap(); 
        Map<Character, Integer> wordMap = new HashMap();
        Integer count = null; 
        
        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i); 
            textMap.put(c, textMap.getOrDefault(c, 0) + 1);
        }
        
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            wordMap.put(c, wordMap.getOrDefault(c, 0) + 1); 
        }
        
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i); 
            int charCount = textMap.getOrDefault(c, 0) / wordMap.get(c);
            if(count == null || count > charCount)
                count = charCount; 
        }
        
        return count == null ? 0: count; 
    }
}