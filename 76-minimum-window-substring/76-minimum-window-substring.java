class Solution {
    public String minWindow(String s, String t) {
        if(s == null || t == null)
            return ""; 
        
        int left = 0;
        int right = 0;
        int min = s.length() + 1; 
        int leftAns = 0;
        int rightAns = -1;
        int count = 0;
        Map<Character, Integer> map = new HashMap(); 
        
        for(int i = 0; i < t.length(); i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1); 
        }
        
        while(right < s.length()){
            if(map.containsKey(s.charAt(right))){
                map.put(s.charAt(right), map.get(s.charAt(right)) - 1); 
                
                if(map.get(s.charAt(right)) >= 0)
                    count++; 
            }
            
            while(left < s.length() && 
                  (!map.containsKey(s.charAt(left)) || map.get(s.charAt(left)) < 0)){
                if(map.getOrDefault(s.charAt(left), 0) < 0)
                    map.put(s.charAt(left), map.get(s.charAt(left)) + 1); 
                left++;
            }
            
            if(count == t.length()){
                if(right-left+1 < min){
                    min = right-left+1; 
                    leftAns = left; 
                    rightAns = right; 
                }
                
                map.put(s.charAt(left), map.get(s.charAt(left)) + 1);
                count--; 
                left++; 
                
                while(left < s.length() &&
                      (!map.containsKey(s.charAt(left)) || map.get(s.charAt(left)) < 0)){
                    if(map.getOrDefault(s.charAt(left), 0) < 0)
                        map.put(s.charAt(left), map.get(s.charAt(left)) + 1); 
                    left++;
                }
            }
            
            right++; 
        }
        
        return s.substring(leftAns, rightAns+1); 
    }
}