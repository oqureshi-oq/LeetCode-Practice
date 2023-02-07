class Solution {
    public int characterReplacement(String s, int k) {
        if(s == null || k < 0)
            return 0; 
        
        int left = 0;
        int right = 0; 
        Map<Character, Integer> map = new HashMap(); 
        int max = 0;
        
        while(right < s.length()){
            char c = s.charAt(right); 
            
            map.put(c, map.getOrDefault(c, 0) + 1); 
            
            max = Math.max(max, map.get(c)); 
            
            if(right - left + 1 - max > k){
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1); 
                left++; 
            }
            
            right++; 
        }
        
        return right - left; 
    }
}