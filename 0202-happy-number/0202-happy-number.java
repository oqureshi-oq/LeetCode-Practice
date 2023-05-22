class Solution {
    public boolean isHappy(int n) {
        if(n <= 0)
            return false; 
        
        int slow = next(n);
        int fast = next(next(n));
        
        while(fast != slow && fast != 1){
            slow = next(slow);
            fast = next(next(fast));
        }
        
        return fast == 1; 
    }
    
    public int next(int n){
        int sum = 0;
        
        while(n != 0){
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        
        return sum; 
    }
}