class Solution {
    public int countPalindromicSubsequence(String s) {
        if(s == null)
            return 0;
        
        Map<Character, Integer> map = new HashMap(); 
        int count = 0; 
        Set<Character> seen = new HashSet();
        
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), i); 
        }
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i); 
            
            if(!seen.add(c) || map.get(c) == i)
                continue;
            
            int j = i+1; 
            Set<Character> set = new HashSet(); 
            
            while(j < map.get(c)){ 
                if(set.add(s.charAt(j++)))
                    count++; 
            }
        }
        
        return count; 
    }
}