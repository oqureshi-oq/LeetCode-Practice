class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null)
            return 0;
        
        int left = s.length()-1; 
        while(left >= 0 && s.charAt(left) == ' ')
            left--; 
        
        int right = left;
        while(right >= 0 && s.charAt(right) != ' ')
            right--; 
        
        return left - right; 
    }
}