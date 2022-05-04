class Solution {
    public String addBinary(String a, String b) {
        if(a == null && b == null) return null;
        if(a == null) return b; 
        if(b == null) return a; 
        
        StringBuilder str = new StringBuilder(); 
        
        int aPointer = a.length()-1; 
        int bPointer = b.length()-1; 
        int carry = 0; 
        
        while(aPointer >= 0 || bPointer >= 0){
            int sum = carry; 
            if(aPointer >= 0)
                sum += a.charAt(aPointer--) - '0'; 
            if(bPointer >= 0)
                sum += b.charAt(bPointer--) - '0';
            
            str.append(sum % 2); 
            carry = sum / 2; 
        }
        
        if(carry == 1) 
            str.append(1); 
        
        return str.reverse().toString(); 
    }
}