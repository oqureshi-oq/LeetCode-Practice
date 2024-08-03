class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(target == null || arr == null || target.length !=  arr.length)
            return false;
        
        Map<Integer, Integer> map = new HashMap(); 
        
        for(int n: target){
            map.put(n, map.getOrDefault(n,0) + 1);
        }
        
        for(int n: arr){
            if(!map.containsKey(n))
                return false;
            
            map.put(n, map.getOrDefault(n,0) - 1);
        }
        
        for(int n: target){
            if(map.get(n) != 0)
                return false; 
        }
        
        return true; 
    }
}