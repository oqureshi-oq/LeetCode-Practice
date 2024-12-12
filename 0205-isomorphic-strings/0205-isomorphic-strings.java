class Solution {
    public boolean isIsomorphic(String s, String t) {
    	//test
    	//test2
        if(s == null || t == null || s.length() != t.length())
            return false; 
        
        int[] sToT = new int[256];
        int[] tToS = new int[256];
        Arrays.fill(sToT, -1);
        Arrays.fill(tToS, -1);
        int n = s.length(); 
        
        for(int i = 0; i < n; i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i); 
            
            if(sToT[sChar] == -1 && tToS[tChar] == -1){
                sToT[sChar] = tChar;
                tToS[tChar] = sChar;
            }
            
            if(sToT[sChar] != tChar || tToS[tChar] != sChar)
                return false; 
        }
        
        return true; 
    }
}