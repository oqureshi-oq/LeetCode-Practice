class Solution {
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> stack = new ArrayDeque(); 
        int ans = 0; 
        
        for(int i = 0; i < tokens.length; i++){
            String str = tokens[i];
            
            if(str.equals("+")){
                stack.push(stack.pop() + stack.pop()); 
            } else if(str.equals("-")){
                int o1 = stack.pop(); 
                int o2 = stack.pop(); 
                stack.push(o2 - o1); 
            } else if(str.equals("*")){
                stack.push(stack.pop() * stack.pop()); 
            } else if(str.equals("/")){
                int o1 = stack.pop(); 
                int o2 = stack.pop(); 
                stack.push(o2 / o1); 
            } else {
                stack.push(Integer.parseInt(str));
            }
        }
        
        return stack.pop(); 
    }
}