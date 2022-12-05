class Solution {
    public int minAddToMakeValid(String s) {
        if(s == null)
            return 0;
        
        int stack = 0; 
        int count = 0; 
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ')')
                stack++; 
            else
                stack--; 
            
            if(stack > 0){
                count += stack;
                stack = 0; 
            }
        }
        
        return count + Math.abs(stack); 
    }
}