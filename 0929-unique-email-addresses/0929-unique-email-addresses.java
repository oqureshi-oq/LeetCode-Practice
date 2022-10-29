class Solution {
    public int numUniqueEmails(String[] emails) {
        if(emails == null)
            return 0;
        
        Set<String> seen = new HashSet(); 
        
        for(String s: emails){
            StringBuilder str = new StringBuilder(); 
            
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i); 
                
                if(c == '@' || c == '+'){
                    str.append(s.substring(s.indexOf('@'), s.length()));
                    break; 
                }
                
                if(c != '.')
                    str.append(c); 
            }
            
            seen.add(str.toString());
        }
        
        return seen.size(); 
    }
}