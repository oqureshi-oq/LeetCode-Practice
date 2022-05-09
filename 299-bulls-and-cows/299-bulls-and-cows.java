class Solution {
    public String getHint(String secret, String guess) {
        if(secret == null || guess == null) return null; 
        
        int bulls = 0; 
        int cows = 0; 
        
        // key = number
        // value = frequency of number in the string  
        Map<Character, Integer> mapSecret = new HashMap();
        Map<Character, Integer> mapGuess = new HashMap(); 
        
        // given that secret.length() == guess.length()
        for(int i = 0; i < secret.length(); i++){
            char s = secret.charAt(i);
            char g = guess.charAt(i); 
            
            if(s == g){
                bulls++;
                continue; 
            }
            
            mapSecret.put(s, mapSecret.getOrDefault(s,0)+1); 
            mapGuess.put(g, mapGuess.getOrDefault(g,0)+1);
            
            if(mapSecret.containsKey(g) && mapSecret.get(g) > 0){
                cows++; 
                mapSecret.put(g, mapSecret.get(g)-1); 
                mapGuess.put(g, mapGuess.get(g)-1);
            }
            
            if(mapGuess.containsKey(s) && mapGuess.get(s) > 0){
                cows++; 
                mapGuess.put(s, mapGuess.get(s)-1); 
                mapSecret.put(s, mapSecret.get(s)-1); 
            }
        }
        
        StringBuilder str = new StringBuilder(); 
        str.append(bulls);
        str.append('A');
        str.append(cows);
        str.append('B'); 

        return str.toString(); 
    }
}