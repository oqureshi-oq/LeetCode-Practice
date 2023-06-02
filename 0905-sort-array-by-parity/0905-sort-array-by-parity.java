class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums == null)
            return null; 
        
        int write = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                int temp = nums[write];
                nums[write] = nums[i];
                nums[i] = temp;
                write++; 
            }
        }
        
        return nums; 
    }
}