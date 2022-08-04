class Solution {
    public String minWindow(String s, String t) {
        if(s == null || t == null)
            return ""; 
        
        Map<Character, Integer> map = new HashMap(); 
        int left = 0;
        int right = 0;
        int min = s.length()+1; 
        int leftAns = -1;
        int rightAns = -1;
        int count = 0; 
        
        for(int i = 0; i < t.length(); i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1); 
        }
        
        while(right < s.length()){
            
            if(map.containsKey(s.charAt(right))){
                if(map.get(s.charAt(right)) > 0)
                    count++;
                
                map.put(s.charAt(right), map.get(s.charAt(right)) - 1); 
            }
            
            while(left <= right && 
                  (!map.containsKey(s.charAt(left)) || map.get(s.charAt(left)) < 0)){
                
                if(map.containsKey(s.charAt(left)))
                    map.put(s.charAt(left), map.get(s.charAt(left)) + 1); 
                
                left++; 
            }
            
            if(count == t.length()){
                
                if(right-left+1 < min){
                    leftAns = left;
                    rightAns = right; 
                    min = right-left+1;
                }
                
                while(count == t.length()){
                    
                    if(map.containsKey(s.charAt(left))){
                        
                        if(map.get(s.charAt(left)) == 0)
                            count--; 
                        
                        map.put(s.charAt(left), map.get(s.charAt(left)) + 1); 
                    }
                    
                    left++; 
                }
            }
            
            right++; 
        }
        
        if(leftAns > -1 && rightAns > -1)
            return s.substring(leftAns, rightAns+1); 
        
        return "";
    }
}