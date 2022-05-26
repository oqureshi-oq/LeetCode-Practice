class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return null;
        
        Map<String, List<String>> map = new HashMap(); 
        
        for(String s: strs){
            char[] arr = s.toCharArray(); 
            char[] charMap = new char[26]; 
            for(char c: arr){
                charMap[c - 'a']++; 
            }
            String key = String.valueOf(charMap); 
            if(!map.containsKey(key))
                map.put(key, new ArrayList());
            map.get(key).add(s);
        }
        
        return new ArrayList(map.values()); 
    }
}