class Solution {
    public int characterReplacement(String s, int k) {
        if(s == null)
            return 0; 
        
        int left = 0;
        int right = 0;
        Map<Character, Integer> map = new HashMap(); 
        int max = 0; 
        int maxFreq = 0; 
        
        while(right < s.length()){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1); 
            
            maxFreq = Math.max(maxFreq, map.get(s.charAt(right))); 
            
            while((right - left + 1) - maxFreq > k){
                map.put(s.charAt(left), map.getOrDefault(s.charAt(left), 0) - 1);
                left++; 
            }
            
            max = Math.max(max, right - left + 1); 
            
            right++; 
        }
        
        return max; 
    }
}