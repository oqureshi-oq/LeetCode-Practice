class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null)
            return new int[0]; 
        
        Map<Integer, Integer> nums1Freq = new HashMap(); 
        
        for(int n: nums1){
            nums1Freq.put(n, nums1Freq.getOrDefault(n, 0) + 1); 
        }
        
        List<Integer> list = new ArrayList(); 
        
        for(int n: nums2){
            if(nums1Freq.getOrDefault(n, 0) > 0){
                list.add(n);
                nums1Freq.put(n, nums1Freq.getOrDefault(n, 0) - 1); 
            }
        }
        
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i); 
        }
        return ans; 
    }
}