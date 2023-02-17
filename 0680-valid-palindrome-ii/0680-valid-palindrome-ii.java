class Solution {
    public boolean validPalindrome(String s) {
        if(s == null)
            return false; 
        
        int left = 0; 
        int right = s.length()-1; 
        
        while(left < right){
            if(s.charAt(left) != s.charAt(right))
                return validPalindrome(s, left+1, right) || validPalindrome(s, left, right-1); 
            
            left++; 
            right--; 
        }
        
        return true; 
    }
    
    private boolean validPalindrome(String s, int left, int right){
        while(left < right){
            if(s.charAt(left) != s.charAt(right))
                return false;
            
            left++; 
            right--;
        }
        
        return true; 
    }
}