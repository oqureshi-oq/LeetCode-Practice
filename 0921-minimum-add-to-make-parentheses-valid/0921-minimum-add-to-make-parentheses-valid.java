class Solution {
    public int minAddToMakeValid(String s) {
        if(s == null)
            return 0;
        
        int count = 0;
        int stack = 0;
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(c == '('){
                stack++; 
            } else {
                if(stack == 0)
                    count++; 
                else
                    stack--; 
            }
        }
        
        return count + stack; 
    }
}