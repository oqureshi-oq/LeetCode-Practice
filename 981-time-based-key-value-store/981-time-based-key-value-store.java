class TimeMap {
    
    private Map<String, List<Pair<Integer, String>>> map; 
    
    public TimeMap() {
        map = new HashMap(); 
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key))
            map.put(key, new ArrayList()); 
        
        Pair<Integer, String> pair = new Pair(timestamp, value); 
        
        map.get(key).add(pair); 
    }
    
    public String get(String key, int timestamp) {
        List<Pair<Integer, String>> list = map.get(key); 
        
        if(list == null)
            return ""; 
        
        int left = 0;
        int right = list.size()-1; 
        int index = 0; 
        
        if(timestamp < list.get(0).getKey())
            return ""; 
        
        while(left <= right){
            int mid = left + (right - left)/2; 
            
            if(list.get(mid).getKey() == timestamp)
                return list.get(mid).getValue(); 
            else if(list.get(mid).getKey() < timestamp){
                left = mid+1;
                index = mid; 
            } else
                right = mid-1; 
        }
        
        return list.get(index).getValue(); 
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */