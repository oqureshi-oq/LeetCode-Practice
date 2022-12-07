class Solution {
    public int minInsertions(String s) {
        if(s == null)
            return 0;
        
        int stack = 0;
        int count = 0; 
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(c == '('){
                stack++; 
            } else {
                if(i+1 < s.length() && s.charAt(i+1) == ')'){
                    if(stack == 0)
                        count++; 
                    else
                        stack--;
                    i++; 
                } else {
                    count++;
                    if(stack == 0)
                        count++;
                    else
                        stack--; 
                }
            }
        }
        
        return count + stack * 2; 
    }
}
    
