class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1 == null || s2 == null)
            return false; 
        
        int left = 0;
        int right = 0; 
        int count = 0;
        Map<Character, Integer> map = new HashMap(); 
        
        for(int i = 0; i < s1.length(); i++){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);  
        }
        
        while(right < s2.length()){
            if(!map.containsKey(s2.charAt(right))){
                
                while(left != right+1){
                    if(map.containsKey(s2.charAt(left)))
                        map.put(s2.charAt(left), map.get(s2.charAt(left)) + 1); 
                    left++; 
                }
                
                count = 0; 
                
            } else {
                while(map.get(s2.charAt(right)) == 0){
                    if(map.containsKey(s2.charAt(left))){
                        map.put(s2.charAt(left), map.get(s2.charAt(left)) + 1); 
                        count--; 
                    }
                    left++; 
                }
                
                map.put(s2.charAt(right), map.get(s2.charAt(right)) - 1); 
                count++; 
                
                if(count == s1.length())
                    return true; 
            }
            
            right++; 
        }
        
        return false; 
    }
}