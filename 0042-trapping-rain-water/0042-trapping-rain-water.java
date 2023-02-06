class Solution {
    public int trap(int[] height) {
        if(height == null)
            return 0;
        
        Deque<Integer> stack = new ArrayDeque(); 
        int current = 0;
        int rain = 0;
        
        while(current < height.length){
            while(!stack.isEmpty() && height[stack.peek()] <= height[current]){
                int middle = stack.pop(); 
                
                if(stack.isEmpty())
                    break;
                
                int h = Math.min(height[stack.peek()], height[current]) - height[middle]; 
                int l = current - stack.peek() - 1; 
                
                rain += h*l; 
            }
            
            stack.push(current++); 
        }
        
        return rain; 
    }
}