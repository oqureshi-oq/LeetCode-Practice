class Solution {
    public int countPalindromicSubsequence(String s) {
        if(s == null)
            return 0;
        
        Map<Character, Integer> map = new HashMap(); 
        //Set<String> set = new HashSet();
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
                //Set<Character> set = new HashSet(); 
                if(set.add(s.charAt(j++)))
                    count++; 
                // StringBuilder sb = new StringBuilder();
                // sb.append(c);
                // sb.append(s.charAt(j)); 
                // sb.append(c);
                // set.add(sb.toString()); 
                // j++; 
            }
        }
        return count; 
        //return set.size(); 
    }
}