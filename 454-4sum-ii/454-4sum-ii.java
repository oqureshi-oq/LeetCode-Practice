class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map12 = new HashMap(); 
        Map<Integer, Integer> map34 = new HashMap(); 
        
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                int sum12 = nums1[i] + nums2[j]; 
                int sum34 = nums3[i] + nums4[j]; 
                
                map12.put(sum12, map12.getOrDefault(sum12, 0) + 1); 
                map34.put(sum34, map34.getOrDefault(sum34, 0) + 1); 
            }
        }
        
        int count = 0; 
        
        for(int ij: map12.keySet()){
            if(map34.containsKey(0-ij))
                count += map12.get(ij) * map34.get(0-ij); 
        }
        
        return count; 
    }
}