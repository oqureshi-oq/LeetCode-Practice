class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null) return new int[0];
        
        Set<Integer> set_nums1 = new HashSet(); 
        Set<Integer> intersectionSet = new HashSet(); 
        int[] intersectionArray; 
        
        for(int n: nums1){
            set_nums1.add(n);
        }
        
        for(int n: nums2){
            if(set_nums1.contains(n))
                intersectionSet.add(n);
        }
        
        intersectionArray = new int[intersectionSet.size()]; 
        int i = 0; 
        
        for(int n: intersectionSet){
            intersectionArray[i++] = n;
        }
        
        return intersectionArray; 
    }
}