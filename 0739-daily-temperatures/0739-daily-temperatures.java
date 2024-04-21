class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        if(temperatures == null)
            return null;
        
        int[] ans = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque(); 
        
        for(int i = 0; i < temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]){
                int index = stack.pop(); 
                ans[index] = i - index; 
            }
            
            stack.push(i);
        }
        
        while(!stack.isEmpty())
            ans[stack.pop()] = 0; 
        
        return ans; 
    }
}