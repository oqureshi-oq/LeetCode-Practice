class Solution {
    public int singleNumber(int[] nums) {
        if(nums == null) return 0;
        
        int actualSum = 0;
        int expectedSum = 0;
        Set<Integer> set = new HashSet(); 
        
        for(int n: nums){
            if(set.add(n))
                expectedSum += 2*n;
            actualSum += n; 
        }
        
        return expectedSum - actualSum; 
    }
}