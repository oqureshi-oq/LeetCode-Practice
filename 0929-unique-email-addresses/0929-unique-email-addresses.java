class Solution {
    public int numUniqueEmails(String[] emails) {
        if(emails == null)
            return 0; 
        
        Set<String> uniqueEmails = new HashSet(); 
        
        for(String email: emails){
            StringBuilder sb = new StringBuilder();
            int i = 0; 
            
            while(i < email.length()){
                char c = email.charAt(i);
                
                if(c == '@' || c == '+')
                    break;
                
                if(c != '.')
                    sb.append(c);
                
                i++; 
            }
            
            sb.append(email.substring(email.indexOf('@'))); 
            
            uniqueEmails.add(sb.toString()); 
        }

        return uniqueEmails.size(); 
    }
}