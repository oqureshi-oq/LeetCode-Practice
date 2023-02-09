class Solution {
    public boolean isValid(String s) {
        if(s == null)
            return false; 
        
        Deque<Character> stack = new ArrayDeque(); 
        Map<Character, Character> map = new HashMap(); 
        
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(!stack.isEmpty() && map.get(stack.peek()) == c)
                stack.pop(); 
            else if(map.containsKey(c))
                stack.push(c); 
            else
                return false; 
        }
        
        return stack.isEmpty(); 
    }
}