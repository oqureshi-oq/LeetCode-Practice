class Solution {
    public int singleNumber(int[] nums) {
        if(nums == null) return -1;
        
        Set<Integer> set = new HashSet(); 
        int sum = 0; 
        for(int n: nums){
            set.add(n); 
            sum += n; 
        }
        
        int doubleSum = 0; 
        for(int n: set){
            doubleSum += n + n; 
        }
        
        return doubleSum - sum;  
    }
}