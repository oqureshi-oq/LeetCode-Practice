class Solution {
    public String addBinary(String a, String b) {
        if(a == null || b == null)
            return null; 
        
        int aP = a.length()-1;
        int bP = b.length()-1;
        StringBuilder str = new StringBuilder();
        int carry = 0;
        
        while(aP >= 0 || bP >= 0 || carry == 1){
            int sum = carry;
            
            if(aP >= 0)
                sum += a.charAt(aP--) - '0';
            
            if(bP >= 0)
                sum += b.charAt(bP--) - '0';
            
            carry = sum / 2;
            str.append(sum % 2);
        }
        
        
        return str.reverse().toString(); 
    }
}