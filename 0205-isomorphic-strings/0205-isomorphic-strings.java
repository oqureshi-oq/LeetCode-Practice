class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null || s.length() != t.length())
            return false; 
        
        int[] sToT = new int[256];
        int[] tToS = new int[256];
        Arrays.fill(sToT, -1);
        Arrays.fill(tToS, -1);
        
        for(int i = 0; i < s.length(); i++){
            if(sToT[s.charAt(i)] == -1)
                sToT[s.charAt(i)] = t.charAt(i);
            
            if(tToS[t.charAt(i)] == -1)
                tToS[t.charAt(i)] = s.charAt(i);
            
            if(sToT[s.charAt(i)] != t.charAt(i) || 
              tToS[t.charAt(i)] != s.charAt(i))
                return false; 
        }
        
        return true; 
    }
}