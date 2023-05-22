class Solution {
    public String reverseWords(String s) {
        if(s == null)
            return "";
        
        int left = 0;
        int right = 0;
        StringBuilder sb = new StringBuilder(); 
        
        while(right < s.length()){
            while(right < s.length() && s.charAt(right) != ' ')
                right++;
            
            for(int i = right-1; left <= i; i--){
                sb.append(s.charAt(i));
            }
            
            sb.append(' ');
            
            left = ++right; 
        }
        
        return sb.toString().substring(0, sb.length()-1);
    }
}