class Solution {
    public int firstUniqChar(String s) {
        if(s == null || s.length() == 0) return -1; 
        
        Map<Character, Integer> map = new HashMap(); 
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i); 
            
            if(map.containsKey(c))
                map.put(c, -1); 
            else
                map.put(c, i); 
        }
        
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) != -1)
                return i; 
        }
        
        return -1; 
    }
}