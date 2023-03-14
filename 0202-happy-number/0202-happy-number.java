class Solution {
    public boolean isHappy(int n) {
        if(n <= 0)
            return false; 
        
        int fast = nextNumber(nextNumber(n));
        int slow = n; 
        
        while(fast != 1 && fast != slow){
            fast = nextNumber(nextNumber(fast));
            slow = nextNumber(slow); 
        }
        
        return fast == 1; 
    }
    
    public int nextNumber(int n){
        int sum = 0;
        
        while(n != 0){
            sum += (n % 10) * (n % 10);
            n /= 10; 
        }
        
        return sum; 
    }
}