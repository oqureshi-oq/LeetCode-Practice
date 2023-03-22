class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap(); 
        
        if(strs == null)
            return new ArrayList(); 
        
        for(String str: strs){ 
            char[] letters = new char[26]; 
            for(int i = 0; i < str.length(); i++){
                letters[str.charAt(i) - 'a']++; 
            }
            String sortedKey = String.valueOf(letters); 
            
            if(!map.containsKey(sortedKey))
                map.put(sortedKey, new ArrayList());
            map.get(sortedKey).add(str); 
        }
        
        return new ArrayList(map.values()); 
    }
}