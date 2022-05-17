class Solution {
    public int romanToInt(String s) {
        if(s == null || s.length() == 0) return -1; 
        
        Map<Character, Integer> map = new HashMap(); 
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000); 
        
        int value = 0; 
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i); 
            
            if((c == 'V' || c == 'X') && i > 0 && s.charAt(i-1) == 'I')
                value += map.get(c) - 2 * map.get('I'); 
            else if((c == 'L' || c == 'C') && i > 0 && s.charAt(i-1) == 'X')
                value += map.get(c) - 2 * map.get('X'); 
            else if((c == 'D' || c == 'M') && i > 0 && s.charAt(i-1) == 'C')
                value += map.get(c) - 2 * map.get('C'); 
            else
                value += map.get(c); 
        }
        
        return value; 
    }
}