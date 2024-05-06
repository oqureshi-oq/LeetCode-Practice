class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null)
            return;
        
        int write = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[write];
                nums[write] = nums[i];
                nums[i] = temp; 
                write++; 
            }
        }
    }
}