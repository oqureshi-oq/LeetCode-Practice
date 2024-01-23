class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack == null || needle == null || needle.length() > haystack.length())
            return -1;
        
        for(int i = 0; i < haystack.length()-needle.length()+1; i++){
            int j = 0;
            
            while(j < needle.length() && needle.charAt(j) == haystack.charAt(i+j))
                j++;
            
            if(j == needle.length())
                return i; 
        }
        
        return -1;
    }
}