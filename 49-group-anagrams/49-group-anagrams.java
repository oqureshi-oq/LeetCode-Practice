class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null) return null; 
        
        Map<String, List<String>> map = new HashMap(); 
        
        for(String str: strs){
            char[] arr = str.toCharArray(); 
            Arrays.sort(arr); 
            String s = new String(arr); 
            if(!map.containsKey(s))
                map.put(s, new ArrayList()); 
            map.get(s).add(str); 
        }
        
        List<List<String>> list = new ArrayList(); 
        
        for(String key: map.keySet()){
            list.add(map.get(key)); 
        }
        
        return list; 
    }
}