class Solution {
    public int singleNumber(int[] nums) {
        if(nums == null) return Integer.MAX_VALUE; 
        
        Set<Integer> set = new HashSet(); 
        int sum = 0; 
        for(int n: nums){
            set.add(n);
            sum += n; 
        }
        
         
        int setSum = 0; 
        for(Object n: set.toArray()){
            setSum += (Integer)n+(Integer)n; 
        }
        
        return setSum - sum; 
    }
}