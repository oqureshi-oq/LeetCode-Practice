class Solution {
    public int numUniqueEmails(String[] emails) {
        if(emails == null)
            return 0; 
        
        Set<String> set = new HashSet(); 
        
        for(String address: emails){
            StringBuilder normalizedAddress = new StringBuilder(); 
            
            for(int i = 0; i < address.length(); i++){
                char c = address.charAt(i);
                
                if(c == '.')
                    continue; 
                
                if(c == '@' || c == '+'){
                    normalizedAddress.append(address.substring(address.indexOf('@')));
                    break; 
                }
                
                normalizedAddress.append(c); 
            }
            
            set.add(normalizedAddress.toString()); 
        }
        
        return set.size(); 
    }
}