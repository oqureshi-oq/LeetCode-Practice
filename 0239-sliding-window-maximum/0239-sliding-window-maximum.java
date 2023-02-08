class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length < k)
            return new int[0];
        
        Deque<Integer> deque = new ArrayDeque(); 
        List<Integer> list = new ArrayList(); 
        
        for(int i = 0; i < nums.length; i++){
            while(!deque.isEmpty() && nums[deque.peekLast()] <= nums[i])
                deque.pollLast(); 
            
            while(!deque.isEmpty() && i - k >= deque.peekFirst())
                deque.pollFirst(); 
            
            deque.addLast(i);
            
            if(i+1 >= k)
                list.add(nums[deque.getFirst()]); 
        }
        
        int[] ans = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i); 
        }
        
        return ans; 
    }
}