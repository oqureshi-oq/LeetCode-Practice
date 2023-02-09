class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens == null)
            return -201; 
        
        Deque<Integer> stack = new ArrayDeque(); 
        
        for(String token: tokens){
            if(!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/")){
                stack.push(Integer.parseInt(token)); 
            } else {
                if(stack.size() < 2)
                    return -201;
                
                int operand2 = stack.pop(); 
                int operand1 = stack.pop(); 
                int ans = 0; 
                
                switch (token){
                    case "+":
                        ans = operand1 + operand2; 
                        break; 
                    case "-":
                        ans = operand1 - operand2;
                        break; 
                    case "*":
                        ans = operand1 * operand2;
                        break;
                    case "/":
                        ans = operand1 / operand2;
                        break; 
                    default:
                        return -201; 
                }
                
                stack.push(ans); 
            }
        }
        
        return stack.pop(); 
    }
}