class Solution {
    public String minWindow(String s, String t) {
        if(s == null || t == null || s.length() < t.length())
            return ""; 
        
        Map<Character, Integer> mapT = new HashMap(); 
        
        for(int i = 0; i < t.length(); i++){
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0) + 1);
        }
        
        Map<Character, Integer> mapS = new HashMap(); 
        int count = 0;
        int left = 0;
        int right = 0;
        int minLeft = 0;
        int minRight = s.length()+1; 
        
        while(right < s.length()){
            char c = s.charAt(right);
            
            mapS.put(c, mapS.getOrDefault(c, 0) + 1);
            
            if(mapS.get(c) <= mapT.getOrDefault(c, 0))
                count++; 
            
            if(count == t.length()){
                while(mapS.get(s.charAt(left)) > mapT.getOrDefault(s.charAt(left), -1)){
                    mapS.put(s.charAt(left), mapS.get(s.charAt(left)) - 1);
                    left++;
                }
                
                if(right - left + 1 < minRight - minLeft + 1){
                    minRight = right;
                    minLeft = left; 
                }
                
                while(count == t.length()){
                    mapS.put(s.charAt(left), mapS.get(s.charAt(left)) - 1);
                    
                    if(mapS.get(s.charAt(left)) < mapT.getOrDefault(s.charAt(left), 0))
                        count--; 
                    
                    left++; 
                }
            }
            
            right++; 
        }
        
        return minRight == s.length() + 1 ? "": s.substring(minLeft, minRight + 1);
    }
}