class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null)
            return 0;
        
        int write = nums.length == 0 ? 0: 1; 
        
        for(int i = 1; i < nums.length; i++){
            if(nums[write-1] != nums[i])
                nums[write++] = nums[i];
        }
        
        return write; 
    }
}