class Solution {
    public int calPoints(String[] operations) {
        if(operations == null)
            return 0;
        
        Deque<Integer> stack = new ArrayDeque(); 
        int sum = 0; 
        int newScore = 0; 
        
        for(String op: operations){
            switch(op){
                case "+":
                    int prev = stack.pop(); 
                    newScore = stack.peek() + prev; 
                    stack.push(prev);
                    stack.push(newScore); 
                    sum += newScore; 
                    break;
                case "D":
                    newScore = stack.peek() * 2; 
                    sum += newScore; 
                    stack.push(newScore); 
                    break;
                case "C":
                    sum -= stack.pop(); 
                    break;
                default: 
                    newScore = Integer.parseInt(op); 
                    sum += newScore; 
                    stack.push(newScore); 
            }
        }
        
        return sum; 
    }
}