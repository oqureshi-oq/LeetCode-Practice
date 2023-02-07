class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1 == null || s2 == null || s1.length() > s2.length())
            return false; 
        
        Map<Character, Integer> map1 = new HashMap(); 
        
        for(int i = 0; i < s1.length(); i++){
            char c = s1.charAt(i); 
            map1.put(c, map1.getOrDefault(c, 0) + 1); 
        }
        
        Map<Character, Integer> map2 = new HashMap(); 
        int count = 0;
        int left = 0;
        int right = 0;
        
        while(right < s2.length()){
            char c = s2.charAt(right); 
            
            map2.put(c, map2.getOrDefault(c, 0) + 1);
            
            while(map2.get(c) > map1.getOrDefault(c, 0)){
                map2.put(s2.charAt(left), map2.get(s2.charAt(left)) - 1);
                left++; 
            }
            
            if(right - left + 1 == s1.length())
                return true; 
            
            right++; 
        }
        
        return false; 
    }
}