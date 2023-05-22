class Solution {
    public int singleNumber(int[] nums) {
        if(nums == null)
            return Integer.MIN_VALUE;
        
        int actualSum = 0;
        int expectedSum = 0;
        Set<Integer> set = new HashSet(); 
        
        for(int n: nums){
            actualSum += n;
            if(set.add(n))
                expectedSum += 2 * n;
        }
        
        return expectedSum - actualSum; 
    }
}