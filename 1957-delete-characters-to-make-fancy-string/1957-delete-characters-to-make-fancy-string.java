class Solution {
    public String makeFancyString(String s) {
        StringBuilder str = new StringBuilder(); 
        char c = s.charAt(0); 
        int count = 1;
        str.append(s.charAt(0));
        
        
        for(int i = 1; i < s.length(); i++){
            if(c == s.charAt(i)){
                count++; 
            } else {
                count = 1;
                c = s.charAt(i); 
            }
            
            
            if(count < 3){
                str.append(c); 
            }
        }
        
        return str.toString(); 
    }
}