class Solution {
    public int minSwaps(String s) {
        if(s == null)
            return 0;
        
        int stack = 0;
        int max = 0; 
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ']')
                max = Math.max(max, ++stack); 
            else
                stack--; 
        }
        
        return (max+1)/2; 
    }
}