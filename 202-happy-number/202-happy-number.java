class Solution {
    public boolean isHappy(int n) {
        Map<Integer, Integer> map = new HashMap(); 
        
        while(true){
            int sumOfSquares = 0; 
            int number = n; 
            
            if(n == 0) return false; 
            
            while(n != 0){
                sumOfSquares += (n%10) * (n%10); 
                n /= 10; 
            }
            
            if(sumOfSquares == 1) return true; 
            
            if(map.containsKey(sumOfSquares))
                return false; 
            else
                map.put(number, sumOfSquares); 
            
            n = sumOfSquares; 
        }
    }
}