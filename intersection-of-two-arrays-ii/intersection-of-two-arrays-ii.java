class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null) return null;
        
        int[] map = new int[1001]; 
        List<Integer> list = new ArrayList(); 
        
        for(int n: nums1){
            map[n]++; 
        }
        
        for(int n: nums2){
            if(map[n]-- > 0)
                list.add(n);
        }
        
        int[] arr = new int[list.size()]; 
        for(int i = 0; i < list.size(); i++) arr[i] = list.get(i); 
        return arr; 
    }
}