class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet(); 
        List<Integer> list = new ArrayList(); 
        
        for(int n: nums1){
            set.add(n);
        }
        
        for(int n: nums2){
            if(set.contains(n)){
                set.remove(n); 
                list.add(n);
            }
        }
        
        int[] array = new int[list.size()]; 
        for(int i = 0; i < array.length; i++){
            array[i] = list.get(i); 
        }
        
        return array; 
    }
}