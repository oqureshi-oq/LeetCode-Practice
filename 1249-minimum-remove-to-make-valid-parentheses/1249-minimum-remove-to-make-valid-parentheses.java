class Solution {
    public String minRemoveToMakeValid(String s) {
        if(s == null)
            return "";
        
        StringBuilder forward = new StringBuilder(); 
        StringBuilder backward = new StringBuilder(); 
        int stack = 0; 
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i); 
            
            if(c != ')')
                forward.append(c);
            
            if(c == '(')
                stack++;
            
            if(c == ')' && stack > 0){
                forward.append(c);
                stack--;
            }
        }
        
        String forwardStr = forward.toString(); 
        stack = 0; 
        
        for(int i = forwardStr.length()-1; i >= 0; i--){
            char c = forwardStr.charAt(i);
            
            if(c != '(')
                backward.append(c);
            
            if(c == ')')
                stack++;
            
            if(c == '(' && stack > 0){
                backward.append(c);
                stack--; 
            }
        }
        
        return backward.reverse().toString(); 
    }
}