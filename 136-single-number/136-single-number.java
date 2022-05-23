class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet(); 
        
        int actualSum = 0;
        int sumOfDuplicates = 0; 
        
        for(int n: nums){
            if(set.add(n))
                sumOfDuplicates += 2*n; 
            actualSum += n; 
        }
        
        return sumOfDuplicates - actualSum; 
    }
}