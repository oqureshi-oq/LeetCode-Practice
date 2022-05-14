class Solution {
    public boolean isHappy(int n) {
        int fast = n; 
        int slow = n; 
        
        while(true){
            fast = getNext(getNext(fast)); 
            slow = getNext(slow); 
            
            if(fast == 1) return true; 
            if(fast == slow) return false; 
        }
    }
    
    public int getNext(int n){
        int nextNumber = 0; 
        
        while(n != 0){
            nextNumber += (n%10) * (n%10); 
            n /= 10; 
        }
        
        return nextNumber; 
    }
}