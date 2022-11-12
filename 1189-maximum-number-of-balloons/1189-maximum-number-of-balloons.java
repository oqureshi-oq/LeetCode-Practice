class Solution {
    public int maxNumberOfBalloons(String text) {
        return maxNumberOfWords(text, "balloon"); 
    }
    
    private int maxNumberOfWords(String text, String word){
        if(text == null || word == null)
            return 0; 
        
        Map<Character, Integer> textMap = new HashMap(); 
        Map<Character, Integer> wordMap = new HashMap(); 
        int count = Integer.MAX_VALUE; 
        
        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i); 
            textMap.put(c, textMap.getOrDefault(c, 0) + 1); 
        }
        
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            wordMap.put(c, wordMap.getOrDefault(c, 0) + 1); 
        }
        
        for(Character c: wordMap.keySet()){
            if(!textMap.containsKey(c))
                return 0; 
            count = Math.min(count, textMap.get(c) / wordMap.get(c)); 
        }
        
        return count == Integer.MAX_VALUE ? 0: count; 
    }
}