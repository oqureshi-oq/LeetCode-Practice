class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null) return -1;
        
        int k = nums.length == 0 ? 0: 1;
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[k-1])
                nums[k++] = nums[i];
        }
        
        return k; 
    }
}