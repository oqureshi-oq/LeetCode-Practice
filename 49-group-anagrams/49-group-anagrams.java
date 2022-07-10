class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null) return null; 
        
        Map<String, List<String>> map = new HashMap(); 
        
        for(String s: strs){
            char[] arr = s.toCharArray(); 
            Arrays.sort(arr);
            String sortedString = new String(arr); 
            
            if(!map.containsKey(sortedString))
                map.put(sortedString, new ArrayList());
            
            map.get(sortedString).add(s); 
        }
        
        return new ArrayList(map.values()); 
    }
}