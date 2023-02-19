class Solution {
    public int calPoints(String[] operations) {
        if(operations == null)
            return 0;
        
        Deque<Integer> stack = new ArrayDeque(); 
        
        for(String op: operations){
            switch(op){
                case "+":
                    int prev = stack.pop(); 
                    int newScore = stack.peek() + prev; 
                    stack.push(prev);
                    stack.push(newScore); 
                    break;
                case "D":
                    stack.push(stack.peek() * 2); 
                    break;
                case "C":
                    stack.pop(); 
                    break;
                default: 
                    stack.push(Integer.parseInt(op)); 
            }
        }
        
        int sum = 0; 
        
        while(!stack.isEmpty()){
            sum += stack.pop(); 
        }
        
        return sum; 
    }
}