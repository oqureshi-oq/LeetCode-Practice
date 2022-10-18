class Solution {
    public String reverseWords(String s) {
        if(s == null)
            return new String(); 
        
        int left = s.length()-1; 
        int right = s.length()-1; 
        StringBuilder str = new StringBuilder(); 
        
        while(right >= 0){
            while(right >= 0 && s.charAt(right) == ' '){
                right--; 
                left--; 
            }
            
            while(right >= 0 && s.charAt(right) != ' ')
                right--; 
            
            if(left >= 0){
                for(int i = right+1; i <= left; i++){
                    str.append(s.charAt(i)); 
                }
            
                str.append(' '); 
            }
            
            left = right; 
        }
        
        return str.toString().substring(0, str.length()-1); 
    }
}