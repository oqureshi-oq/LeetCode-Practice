class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        if(strings == null)
            return new ArrayList(); 
        
        Map<String, List<String>> map = new HashMap(); 
        
        for(String str: strings){
            int shift = str.charAt(0) - 'a';
            char[] arr = str.toCharArray(); 
            
            for(int i = 0; i < arr.length; i++){
                arr[i] = (char) ((arr[i] - shift) % 26 + 'a'); 
            }
            
            String key = new String(arr);
            
            if(!map.containsKey(key))
                map.put(key, new ArrayList());
            
            map.get(key).add(str);
        }
        
        return new ArrayList(map.values()); 
    }
}