class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null || s.length() != t.length())
            return false; 
        
        return isEqual(transform(s), transform(t));
    }
    
    public int[] transform(String s){
        if(s == null) return null; 
        
        int[] map = new int[256]; 
        int[] arr = new int[s.length()]; 
        Arrays.fill(map, -1); 
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(map[c] == -1)
                map[c] = i;
            
            arr[i] = map[c]; 
        }
        
        return arr; 
    }
    
    public boolean isEqual(int[] s, int[] t){
        if(s == null || t == null || s.length != t.length)
            return false; 
        
        for(int i = 0; i < s.length; i++){
            if(s[i] != t[i])
                return false; 
        }
        
        return true; 
    }
}