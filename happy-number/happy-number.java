class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet(); 
        
        while(n != 1 && !seen.contains(n)){
            seen.add(n);
            n = getNext(n); 
        }
        
        return n==1; 
    }
    
    public int getNext(int n){
        int sum = 0;
        
        while(n != 0){
            sum += (n%10) * (n%10);
            n /= 10; 
        }
        
        return sum; 
    }
}