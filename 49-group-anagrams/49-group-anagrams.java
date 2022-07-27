class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList(); 
        Map<String, List<String>> map = new HashMap(); 
        
        if(strs == null)
            return list; 
        
        for(String s: strs){
            char[] ca = new char[26];
            for (char c : s.toCharArray()) 
                ca[c - 'a']++;
            String keyStr = new String(ca);
            
            if(!map.containsKey(keyStr))
                map.put(keyStr, new ArrayList());
            
            map.get(keyStr).add(s); 
        }
        
        for(String key: map.keySet()){
            list.add(map.get(key)); 
        }
        
        return list; 
    }
}