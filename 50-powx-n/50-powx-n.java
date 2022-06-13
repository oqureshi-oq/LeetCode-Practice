class Solution {
    public double myPow(double x, int n){
        double y = myPowAbsolute(x, n); 
        return n >= 0 ? y: 1/y; 
    }
    public double myPowAbsolute(double x, int n) {
        n = Math.abs(n); 
        if(n == 0) return 1;
        if(x == 1) return 1; 
        
        double firstHalf = myPowAbsolute(x, n/2);
        
        if(n % 2 == 0)
            return firstHalf * firstHalf;
        
        return firstHalf * firstHalf * x; 
    }
    
//             if(n == 0 || Math.abs(x) == 1) return n % 2 == 0 || x >= 0 ? 1: -1;  
//         if(x == 0 || n == 1) return x; 
//         if(n == Integer.MIN_VALUE) return 0; 
        
//         double ans = x;
//         int i = 1;
        
//         while(1 <= i*2 && i*2 < Math.abs(n)){
//             ans *= ans;
//             i *= 2; 
//         }
        
//         while(i < Math.abs(n)){
//             ans *= x;
//             i++; 
//         }
        
        
//         //System.out.println(ans); 
//         return n > 0 ? ans: 1.0/ans; 
}
