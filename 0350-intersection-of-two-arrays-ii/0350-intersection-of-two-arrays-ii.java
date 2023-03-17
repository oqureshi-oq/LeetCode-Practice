class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null)
            return null; 
        
        Map<Integer, Integer> map = new HashMap(); 
        
        for(int n: nums1){
            map.put(n, map.getOrDefault(n,0) + 1);
        }
        
        int write = 0; 
        
        for(int n: nums2){
            if(map.containsKey(n) && map.get(n) > 0){
                nums2[write++] = n; 
                map.put(n, map.get(n) - 1); 
            }
        }
        
        return Arrays.copyOf(nums2, write); 
    }
}