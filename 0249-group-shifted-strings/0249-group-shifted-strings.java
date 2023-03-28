class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        if(strings == null)
            return new ArrayList(); 
        
        Map<String, List<String>> map = new HashMap(); 
        
        for(String str: strings){
            int diff = str.charAt(0) - 'a';
            
            char[] arr = new char[str.length()]; 
            
            for(int i = 0; i < str.length(); i++){
                arr[i] = (char) ((str.charAt(i) - diff) % 26);
            }
            
            String key = String.valueOf(arr); 
            
            if(!map.containsKey(key))
                map.put(key, new ArrayList());
            
            map.get(key).add(str); 
        }
        
        return new ArrayList(map.values()); 
    }
}