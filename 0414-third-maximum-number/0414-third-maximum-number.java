class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        Set<Integer> taken = new HashSet<Integer>();
        
        for(int n: nums){
            if(minHeap.size() == 3){
                if(minHeap.peek() < n && !taken.contains(n)){
                    taken.remove(minHeap.poll());
                    minHeap.add(n);
                    taken.add(n);
                }
            } else if (!taken.contains(n)){
                minHeap.add(n);
                taken.add(n);
            }
        }
        
        if(minHeap.size() == 3)
            return minHeap.poll();
        
        int ans = minHeap.poll(); 
        while(!minHeap.isEmpty())
            ans = minHeap.poll(); 
        return ans; 
    }
}