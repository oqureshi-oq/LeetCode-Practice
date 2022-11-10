class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null)
            return 0; 
        
        int i = s.length()-1; 
        int length = 0; 
        
        while(i >= 0 && s.charAt(i) == ' ')
            i--; 
        
        while(i >= 0 && s.charAt(i) != ' '){
            length++;
            i--; 
        }
        
        return length; 
    }
}