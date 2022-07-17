class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null) return new int[0]; 
        
        Map<Integer, Integer> map = new HashMap(); 
        List<Integer> list = new ArrayList(); 
        int[] intersection; 
        
        for(int n: nums1){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        for(int n: nums2){
            if(map.getOrDefault(n, 0) > 0){
                list.add(n);
                map.put(n, map.get(n)-1); 
            }
        }
        
        intersection = new int[list.size()]; 
        
        for(int i = 0; i < list.size(); i++){
            intersection[i] = list.get(i); 
        }
        
        return intersection; 
    }
}