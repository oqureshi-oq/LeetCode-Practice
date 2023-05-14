class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null && nums2 == null)
            return null; 
        
        if(nums1 == null)
            return nums2;
        
        if(nums2 == null)
            return nums1;
        
        Set<Integer> seen1 = new HashSet(); 
        
        for(int n: nums1){
            seen1.add(n);
        }
        
        Set<Integer> intersect = new HashSet();
        
        for(int n: nums2){
            if(seen1.contains(n))
                intersect.add(n);
        }
        
        int[] ans = new int[intersect.size()];
        int i = 0; 
        for(int n: intersect){
            ans[i++] = n;
        }
        
        return ans; 
    }
}