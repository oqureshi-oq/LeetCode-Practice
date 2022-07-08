class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null) return null; 
        
        Set<Integer> set = new HashSet(); 
        
        int[] minArr = nums1.length < nums2.length ? nums1: nums2; 
        int[] otherArr = minArr == nums1 ? nums2: nums1; 
        
        for(int n: minArr){
            set.add(n);
        }
        
        Set<Integer> intersection = new HashSet(); 
        for(int n: otherArr){
            if(set.contains(n))
                intersection.add(n);
        }
        
        int[] ans = new int[intersection.size()];
        int i = 0; 
        for(int n: intersection){
            ans[i++] = n; 
        }
        
        return ans; 
    }
}