class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack == null || needle == null || needle.length() > haystack.length())
            return -1; 
        
        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            int j = 0; 
            
            while(j < needle.length() && i + j < haystack.length() && haystack.charAt(i+j) == needle.charAt(j))
                j++; 
            
            if(j == needle.length())
                return i; 
        }
        
        return -1; 
    }
}