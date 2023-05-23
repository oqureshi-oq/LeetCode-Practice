class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null)
            return null;
        
        Map<Integer, Integer> map = new HashMap(); 
        
        for(int n: nums1){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        List<Integer> list = new ArrayList(); 
        
        for(int n: nums2){
            if(map.getOrDefault(n, 0) > 0){
                list.add(n);
                map.put(n, map.getOrDefault(n,0)-1);
            }
        }
        
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans; 
    }
}