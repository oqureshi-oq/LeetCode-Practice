class MinStack {
    Deque<Integer> regStack;
    Deque<Integer> minStack; 

    public MinStack() {
        regStack = new ArrayDeque(); 
        minStack = new ArrayDeque(); 
    }
    
    public void push(int val) {
        regStack.push(val); 
        if(minStack.isEmpty() || minStack.peek() >= val)
            minStack.push(val); 
    }
    
    public void pop() {
        if(regStack.isEmpty())
            return; 
        
        int removedInt = regStack.pop();
        
        if(!minStack.isEmpty() && removedInt == minStack.peek())
            minStack.pop(); 
    }
    
    public int top() {
        return regStack.peek(); 
    }
    
    public int getMin() {
        return minStack.peek(); 
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */