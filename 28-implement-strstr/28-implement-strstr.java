class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack == null || needle == null) return -1; 
        if(needle.length() == 0) return 0; 
        
        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            int j = i; 
            int k = 0; 
            while(k < needle.length() && haystack.charAt(j) == needle.charAt(k)){
                j++; 
                k++; 
            }
            
            if(k == needle.length()) 
                return i; 
        }
        
        return -1; 
    }
}