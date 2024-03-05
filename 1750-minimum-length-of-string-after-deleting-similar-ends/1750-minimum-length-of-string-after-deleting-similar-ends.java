class Solution {
    public int minimumLength(String s) {
        if(s == null)
            return -1;
        
        int left = 0;
        int right = s.length()-1; 
        
        while(left < right && s.charAt(left) == s.charAt(right)){
            char c = s.charAt(left);
            
            while(left < s.length() && s.charAt(left) == c)
                left++; 
            
            while(-1 < right && s.charAt(right) == c)
                right--;
        }
        
        // System.out.println(left);
        // System.out.println(right); 
        
        return Math.max(0, right - left + 1); 
    }
}