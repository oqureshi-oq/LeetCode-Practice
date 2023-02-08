class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length < k)
            return new int[0];
        
        Deque<Integer> deque = new ArrayDeque(); 
        List<Integer> list = new ArrayList();
            
        for(int i = 0; i < nums.length; i++){
            while(!deque.isEmpty() && nums[deque.getLast()] <= nums[i])
                deque.pollLast();  
            
            while(!deque.isEmpty() && i - k >= deque.peek())
                deque.poll(); 
            
            deque.add(i);
                        
            if(!deque.isEmpty() && i+1 >= k)
                list.add(nums[deque.peek()]);
        }
        
        int[] ans = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        
        return ans; 
    }
}