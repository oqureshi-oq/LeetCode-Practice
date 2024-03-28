class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null)
            return new LinkedList(); 
        
        Map<String, List> map = new HashMap(); 
        
        for(String str: strs){
            char[] letters = new char[26];
            
            for(int i = 0; i < str.length(); i++){
                letters[str.charAt(i) - 'a']++; 
            }
            
            String key = new String(letters);
            
            if(!map.containsKey(key))
                map.put(key, new LinkedList());
            
            map.get(key).add(str); 
        }
        
        return new ArrayList(map.values()); 
    }
}