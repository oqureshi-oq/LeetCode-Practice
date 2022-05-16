class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return null; 
        
        Map<String, List<String>> map = new HashMap(); 
        
        for(String s: strs){
            char[] sArr = s.toCharArray(); 
            char[] charMap = new char[26]; 
            for(char c: sArr){
                charMap[c - 'a']++; 
            }
            String sortedCharMapString = new String(charMap); 
            if(!map.containsKey(sortedCharMapString))
                map.put(sortedCharMapString, new ArrayList()); 
            map.get(sortedCharMapString).add(s); 
        }
        
        return new ArrayList(map.values()); 
    }
}