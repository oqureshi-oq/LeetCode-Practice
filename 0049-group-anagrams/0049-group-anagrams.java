class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null)
            return new ArrayList(); 
        
        Map<String, List<String>> map = new HashMap(); 
        
        for(String str: strs){
            char[] letters = new char[26]; 
            for(int i = 0; i < str.length(); i++){
                letters[str.charAt(i) - 'a']++; 
            }
            String key = String.valueOf(letters); 
            if(!map.containsKey(key))
                map.put(key, new ArrayList());
            map.get(key).add(str); 
        }
        
        return new ArrayList(map.values()); 
    }
}