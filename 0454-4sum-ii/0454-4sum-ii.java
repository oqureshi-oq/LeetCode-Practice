class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        if(nums1 == null || nums2 == null || nums3 == null || nums4 == null)
            return 0; 
        
        
        Map<Integer, Integer> first2 = new HashMap(); 
        Map<Integer, Integer> last2 = new HashMap(); 
        int n = nums1.length; 
        
        if(n != nums2.length || n != nums3.length || n != nums4.length)
            return 0; 
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                first2.put(nums1[i] + nums2[j], first2.getOrDefault(nums1[i] + nums2[j], 0) + 1);
                last2.put(nums3[i] + nums4[j], last2.getOrDefault(nums3[i] + nums4[j], 0) + 1);
            }
        }
        
        int count = 0; 
        
        for(int i: first2.keySet()){
            if(last2.containsKey(-i))
                count += first2.get(i) * last2.get(-i);  
        }
        
        return count; 
    }
}