class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length < 1)
            return 0;
        
        int k = 1;
        
        for(int n: nums){
            if(nums[k-1] != n)
                nums[k++] = n;
        }
        
        return k; 
    }
}