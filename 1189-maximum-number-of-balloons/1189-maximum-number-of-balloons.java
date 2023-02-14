class Solution {
    public int maxNumberOfBalloons(String text) {
        return maxNumberOfAWord(text, "balloon"); 
    }
    
    private int maxNumberOfAWord(String text, String word){
        if(text == null || word == null)
            return 0; 
        
        int[] textLetters = new int[26];
        int[] wordLetters = new int[26]; 
        int count = text.length() + 1; 
        
        for(int i = 0; i < text.length(); i++){
            textLetters[text.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < word.length(); i++){
            wordLetters[word.charAt(i) - 'a']++; 
        }
        
        for(int i = 0; i < 26; i++){
            if(wordLetters[i] != 0){
                count = Math.min(count, textLetters[i] / wordLetters[i]);  
            }
        }
        
        return count == text.length() + 1 ? 0: count;
    }
}