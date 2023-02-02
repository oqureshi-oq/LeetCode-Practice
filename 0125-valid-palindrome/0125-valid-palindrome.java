class Solution {
    public boolean isPalindrome(String s) {
        if(s == null)
            return false; 
        
        int left = 0;
        int right = s.length()-1; 
        
        while(left < right){
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right); 
            
            if(!Character.isDigit(leftChar) && !Character.isAlphabetic(leftChar))
                left++;
            else if(!Character.isDigit(rightChar) && !Character.isAlphabetic(rightChar))
                right--;
            else if(Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar))
                return false; 
            else {
                left++; 
                right--; 
            }
            
        }
        
        return true; 
    }
}