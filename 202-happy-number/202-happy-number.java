class Solution {
    public boolean isHappy(int n) {
        int fast = n; 
        int slow = n; 
        
        do{
            fast = nextNumber(nextNumber(fast));
            slow = nextNumber(slow); 
        } while(fast != 1 && fast != slow);
        
        return fast == 1; 
    }
    
    public int nextNumber(int n){
        if(n <= 0) return -1;
        
        int sum = 0;
        
        while(n != 0){
            sum += (n % 10) * (n % 10);
            n /= 10; 
        }
        
        return sum; 
    }
}