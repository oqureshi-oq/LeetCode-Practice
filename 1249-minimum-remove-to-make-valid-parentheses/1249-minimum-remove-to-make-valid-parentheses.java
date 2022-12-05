class Solution {
    public String minRemoveToMakeValid(String s) {
        if(s == null)
            return "";
        
        int stack = 0; 
        StringBuilder str = new StringBuilder(); 
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i); 
            
            if(c == '('){
                stack++; 
                str.append(c); 
            } else if(c == ')'){
                if(stack > 0){
                    stack--;
                    str.append(c); 
                }
            } else {
                str.append(c); 
            }
        }
        
        int i = str.length()-1; 
        
        while(stack > 0){
            if(str.charAt(i) == '('){
                str.deleteCharAt(i);
                stack--; 
            }
            i--; 
        } 
        
        return str.toString(); 
    }
}