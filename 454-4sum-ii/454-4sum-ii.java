class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        if(nums1 == null || nums2 == null || nums3 == null || nums4 == null)
            return -1;
        
        if(nums1.length != nums2.length || nums2.length != nums3.length || 
           nums3.length != nums4.length)
            return -1; 
        
        Map<Integer, Integer> map1 = new HashMap(); 
        Map<Integer, Integer> map2 = new HashMap(); 
        int count = 0; 
        
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                map1.put(nums1[i] + nums2[j], map1.getOrDefault(nums1[i] + nums2[j], 0) + 1); 
                map2.put(nums3[i] + nums4[j], map2.getOrDefault(nums3[i] + nums4[j], 0) + 1); 
            }
        }
        
        for(int key: map1.keySet()){
            if(map2.containsKey(0 - key))
                count += map1.get(key) * map2.get(0 - key); 
        }
        
        return count; 
    }
}