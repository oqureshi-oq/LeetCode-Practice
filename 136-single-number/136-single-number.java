class Solution {
    public int singleNumber(int[] nums) {
        if(nums == null) return -1; 
        
        Set<Integer> set = new HashSet(); 
        
        for(int n: nums){
            if(set.contains(n))
                set. remove(n);
            else
                set.add(n); 
        }
        
        return (int)set.toArray()[0]; 
    }
}