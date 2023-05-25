class TwoSum {
    private Map<Integer, Integer> map; 
    
    public TwoSum() {
        map = new HashMap(); 
    }
    
    public void add(int number) {
        map.put(number, map.getOrDefault(number, 0)+1);
    }
    
    public boolean find(int value) {
        for(int n: map.keySet()){
            int diff = value - n; 
            if(map.getOrDefault(diff, 0) >= 2 || diff != n && map.containsKey(diff))
                return true; 
        }
        
        return false; 
    }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */