class Solution {
    public String addBinary(String a, String b) {
        if(a == null || b == null)
            return null; 
        
        int pA = a.length()-1; 
        int pB = b.length()-1;
        int carry = 0; 
        StringBuilder sb = new StringBuilder(); 
        
        while(pA >= 0 || pB >= 0 || carry == 1){
            int sum = carry;
            
            if(pA >= 0)
                sum += a.charAt(pA--) - '0';  
            
            if(pB >= 0)
                sum += b.charAt(pB--) - '0'; 
            
            sb.append(sum % 2); 
            
            carry = sum / 2; 
        }
        
        return sb.reverse().toString(); 
    }
}