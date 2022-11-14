class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap(); 
        Deque<Integer> deque = new ArrayDeque(); 
        
        for(int i = 0; i < nums2.length; i++){
            while(!deque.isEmpty() && nums2[deque.getFirst()] < nums2[i]){
                nums2[deque.pollFirst()] = nums2[i]; 
            }
            
            map.put(nums2[i], i); 
            deque.addFirst(i); 
        }
        
        while(!deque.isEmpty())
            nums2[deque.pollFirst()] = -1; 
        
        for(int i = 0; i < nums1.length; i++){
            nums1[i] = nums2[map.get(nums1[i])];  
        }
        
        return nums1; 
    }
}