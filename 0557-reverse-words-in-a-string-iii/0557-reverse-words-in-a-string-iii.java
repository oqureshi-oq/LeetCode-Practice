class Solution {
    public String reverseWords(String s) {
        if(s == null)
            return new String(); 
        
        int left = 0;
        int right = 0;
        StringBuilder str = new StringBuilder(); 
        
        while(right < s.length()){
            while(right < s.length() && s.charAt(right) != ' ')
                right++; 
            
            for(int i = right-1; i >= left; i--){
                str.append(s.charAt(i));
            }
            
            str.append(' '); 
            
            left = ++right; 
        }
        
        return str.toString().substring(0, str.length()-1); 
    }
}