class Solution {
    
    Map<Integer, Integer> map; 
    
    public int fib(int n) {
        map = new HashMap(); 
        map.put(0, 0);
        map.put(1, 1); 
        return fibHelper(n); 
    }
    
    public int fibHelper(int n){
        if(n == 0) return 0;
        if(n == 1) return 1; 
        
        int ans = 0; 
        
        if(!map.containsKey(n-1))
            map.put(n-1, fibHelper(n-1)); 
        
        if(!map.containsKey(n-2))
            map.put(n-2, fibHelper(n-2));
        
        map.put(n, map.get(n-1) + map.get(n-2));
        
        return map.get(n); 
    }
}