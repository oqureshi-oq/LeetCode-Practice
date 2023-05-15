class Solution {
    public boolean isHappy(int n) {
        if(n <= 0)
            return false; 
        
        int slow = n;
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
            int digit = n % 10; 
            sum += digit * digit; 
            n /= 10; 
        }
        
        return sum;
    }
}