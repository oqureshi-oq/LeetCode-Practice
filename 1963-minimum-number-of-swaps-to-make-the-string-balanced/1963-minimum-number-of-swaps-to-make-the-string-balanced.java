class Solution {
    public int minSwaps(String s) {
        if(s == null)
            return -1;
        
        int stack = 0;
        int misMatch = 0;
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i); 
            
            if(stack <= 0 && c == ']')
                misMatch++; 
            else if(c == '[')
                stack++; 
            else if(stack > 0 && c == ']')
                stack--; 
        }
        
        return (misMatch + 1) /2;
    }
}