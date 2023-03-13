class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null)
            return null; 
        
        Set<Integer> set1 = new HashSet();
        Set<Integer> intersectionSet = new HashSet(); 
        
        for(int n: nums1){
            set1.add(n);
        }
        
        for(int n: nums2){
            if(set1.contains(n))
                intersectionSet.add(n);
        }
        
        int[] ans = new int[intersectionSet.size()];
        int i = 0; 
        
        for(int n: intersectionSet){
            ans[i++] = n; 
        }
        
        return ans; 
    }
}