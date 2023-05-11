class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
            return -1;
        
        int write = 1;
        
        for(int n: nums){
            if(n != nums[write-1])
                nums[write++] = n;
        }
        
        return write; 
    }
}