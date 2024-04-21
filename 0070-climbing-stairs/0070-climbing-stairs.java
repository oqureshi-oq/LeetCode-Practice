class Solution {
    public int climbStairs(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1; 
        
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        
        for(int i = 3; i < n+1; i++){
            dp[i] = dp[i-2] + dp[i-1];
        }
        
        return dp[n]; 
    }
}

//f(n) = f(n-1) + 1;
//f(n) = f(n-2) + 1