class Solution {
    public double myPow(double x, int n) {
        return n >= 0 ? helper(x, Math.abs(n)): 1.0/helper(x, Math.abs(n));
    }
    
    public double helper(double x, int n){
        if(n == 0 || x == 1) return 1;
        return n % 2 == 0 ? helper(x*x, n/2): x * helper(x*x, n/2); 
    }
}