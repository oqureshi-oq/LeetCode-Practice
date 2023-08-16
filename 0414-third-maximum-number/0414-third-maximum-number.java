class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        Set<Integer> taken = new HashSet<Integer>();
        
        for(int n: nums){
            if(!taken.contains(n)){
                taken.add(n);
                maxHeap.add(n);
            }
        }
        
        if(maxHeap.size() < 3)
            return maxHeap.poll(); 
        
        maxHeap.poll();
        maxHeap.poll();
        return maxHeap.poll(); 
    }
}