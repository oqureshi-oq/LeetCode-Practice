class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return 1;
        if(n == 1) return x; 
        double half = myPow(x, Math.abs(n/2)); 
        half *= half; 
        if(Math.abs(n) % 2 == 1) half *= x; 
        return n > 0 ? half: 1/half; 
    }
}