class Solution {
    public int climbStairs(int n) {
        if(n == 0)
            return 0;
        if(n == 1)
            return 1; 
        
        int first = 1;
        int second = 2;
        
        for(int i = 3; i < n+1; i++){
            int third = second + first;
            first = second;
            second = third; 
        }
        
        return second; 
    }
}

//f(n) = f(n-1) + 1;
//f(n) = f(n-2) + 1