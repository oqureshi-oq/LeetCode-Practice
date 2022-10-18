class Solution {
    public boolean isHappy(int n) {
        if(n <= 0)
            return false; 
        
        Set<Integer> seen = new HashSet(); 
        
        while(!seen.contains(n)){   
            seen.add(n); 
            
            int sum = 0; 
            
            while(n != 0){
                sum += (n % 10) * (n % 10); 
                n /= 10;
            }
            
            n = sum; 
        }
        
        return n == 1; 
    }
}