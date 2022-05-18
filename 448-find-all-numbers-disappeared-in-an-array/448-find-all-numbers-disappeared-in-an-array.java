class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums == null) return null; 
        
        Set<Integer> seen = new HashSet(); 
        
        for(int i: nums){
            seen.add(i); 
        }
        
        List<Integer> list = new ArrayList(); 
        for(int i = 1; i <= nums.length; i++){
            if(!seen.contains(i))
                list.add(i); 
        }
        
        return list; 
    }
}