class Solution {
    public double myPow(double x, int n) {
        double ans = myPowHelper(x, Math.abs(n));  
        
        if(n < 0)
            return 1.0/ans; 
        
        return ans;  
    }
    
    public double myPowHelper(double x, int n){
        if(n == 1)
            return x; 
        if(n == 0)
            return 1; 
        
        double ans = myPowHelper(x, n/2);  
        
        if(n % 2 != 0)
            ans *= myPowHelper(x, n/2 + 1); 
        else
            ans *= ans; 
 
        return ans;
    }
}