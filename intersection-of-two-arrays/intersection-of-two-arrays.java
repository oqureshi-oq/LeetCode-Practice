class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null) return null; 
        
        Set<Integer> set = new HashSet(); 
        Set<Integer> intersection = new HashSet(); 
        
        for(int n: nums1){
            set.add(n); 
        }
        
        for(int n: nums2){
            if(set.contains(n))
                intersection.add(n); 
        }
        
        int[] arr = new int[intersection.size()];
        int i = 0; 
        for(int n: intersection){
            arr[i++] = n; 
        }
        
        return arr; 
    }
}