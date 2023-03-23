class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        if(strings == null)
            return new ArrayList(); 
        
        Map<String, List<String>> map = new HashMap(); 
        
        for(String str: strings){    
            if(str == null || str.length() == 0)
                continue; 
            
            StringBuilder sb = new StringBuilder(); 
            
            int diff = str.charAt(0) - 'a';
            
            for(int i = 0; i < str.length(); i++){
                int c = (str.charAt(i) - diff) % 26;  
                sb.append((char) c); 
            }
            
            String key = sb.toString(); 
            
            if(!map.containsKey(key))
                map.put(key, new ArrayList()); 
            
            map.get(key).add(str); 
        }
        
        return new ArrayList(map.values()); 
    }
}