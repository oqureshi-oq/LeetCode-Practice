class Solution {
    final int NUMBER_OF_LETTERS = 26; 
    
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null)
            return new ArrayList(); 
        
        Map<String, List> map = new HashMap();
        
        for(String str: strs){
            char[] letters = new char[NUMBER_OF_LETTERS]; 
            
            for(int i = 0; i < str.length(); i++){
                letters[str.charAt(i) - 'a']++; 
            }
            
            String key = new String(letters);
            
            if(!map.containsKey(key))
                map.put(key, new ArrayList()); 
            
            map.get(key).add(str); 
        }
        
        return new ArrayList(map.values()); 
    }
}