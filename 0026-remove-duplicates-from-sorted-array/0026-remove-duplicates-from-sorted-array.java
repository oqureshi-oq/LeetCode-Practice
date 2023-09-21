class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null)
            return 0;
        
        int k = nums.length <= 0 ? 0 : 1;
        
        for(int i = 1; i < nums.length; i++){
            if(nums[k-1] != nums[i])
                nums[k++] = nums[i];
        }
        
        return k; 
    }
}