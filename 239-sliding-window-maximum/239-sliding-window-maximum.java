class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k <= 0 || k > nums.length)
            return new int[0];
        
        Deque<Integer> deque = new ArrayDeque(); 
        int[] ans = new int[nums.length - k + 1]; 
        int maxIndex = 0; 
            
        for(int i = 0; i < nums.length; i++){
            while(!deque.isEmpty() && deque.getFirst() < i-(k-1))
                deque.pollFirst(); 
            
            while(!deque.isEmpty() && nums[deque.getLast()] < nums[i])
                deque.pollLast(); 
            
            deque.addLast(i); 
            
            if(i >= k-1)
                ans[i-(k-1)] = nums[deque.getFirst()];
        }
        
        return ans; 
    }
}