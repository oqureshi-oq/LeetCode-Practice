class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        
        int k = 1;
        
        for(int i = 0 ; i < nums.length; i++){
            if(nums[k-1] != nums[i])
                nums[k++] = nums[i];
        }
        
        return k; 
    }
}