class Solution {
    public int numUniqueEmails(String[] emails) {
        if(emails == null)
            return 0;
        
        Set<String> normalizedEmails = new HashSet(); 
        
        for(String email: emails){
            StringBuilder processedEmail = new StringBuilder(); 
            int i = 0;
            
            while(i < email.length()){
                char c = email.charAt(i); 
                if(c == '@' || c == '+')
                    break;
                
                if(c != '.')
                    processedEmail.append(c); 
                
                i++; 
            }
            
            processedEmail.append(email.substring(email.indexOf('@')));
            normalizedEmails.add(processedEmail.toString()); 
        }
        
        return normalizedEmails.size(); 
    }
}