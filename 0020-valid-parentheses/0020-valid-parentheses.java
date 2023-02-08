class Solution {
    public boolean isValid(String s) {
        if(s == null)
            return false; 
        
        Deque<Character> stack = new ArrayDeque(); 
        Map<Character, Character> map = new HashMap(3);
        map.put('(', ')'); 
        map.put('{', '}');
        map.put('[', ']');
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(!stack.isEmpty() && map.getOrDefault(stack.peek(), '0') == c)
                stack.pop(); 
            else
                stack.push(c); 
        }
        
        return stack.isEmpty(); 
    }
}