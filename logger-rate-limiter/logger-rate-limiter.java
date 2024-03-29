class Logger {

    private Map<String, Integer> map;  
        
        
    public Logger() {
        map = new HashMap(); 
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        boolean shouldPrint = false; 
        
        if(!map.containsKey(message) || timestamp >= map.get(message) + 10){
            shouldPrint = true;
            map.put(message, timestamp); 
        }
        
        return shouldPrint; 
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */