class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1 == null || s2 == null)
            return false; 
        
        Map<Character, Integer> map = new HashMap(); 
        
        for(int i = 0; i < s1.length(); i++){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1); 
        }
        
        int left = 0; 
        int right = 0; 
        int count = 0; 
        
        while(right < s2.length()){
            if(map.getOrDefault(s2.charAt(right), 0) > 0){
                map.put(s2.charAt(right), map.get(s2.charAt(right)) - 1); 
                count++;  
                right++; 
                
                if(count == s1.length())
                    return true; 
            } else {
                while(left != right+1 && map.getOrDefault(s2.charAt(right), 0) <= 0){
                    if(map.containsKey(s2.charAt(left))){
                        count--;
                        map.put(s2.charAt(left), map.get(s2.charAt(left)) + 1); 
                    } 
                    
                    left++; 
                }
                
                if(left == right+1)
                    right++; 
            }
            
            
        }
        
        return false; 
    }
}