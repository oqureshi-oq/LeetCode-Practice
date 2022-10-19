class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null)
            return new ArrayList(); 
        
        Map<String, List<String>> map = new HashMap(); 
        
        for(String s: strs){            
            char[] sortedArr = new char[26]; 
            
            for(int i = 0; i < s.length(); i++){
                sortedArr[s.charAt(i) - 'a']++; 
            }
            
            String sortedString = new String(sortedArr); 
            
            if(!map.containsKey(sortedString))
                map.put(sortedString, new ArrayList()); 
            
            map.get(sortedString).add(s); 
        }
        
        List<List<String>> list = new ArrayList(); 
        
        for(String s: map.keySet()){
            list.add(map.get(s)); 
        }
        
        return list; 
    }
}