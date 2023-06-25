class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums == null)
            return null;
        
        int eI = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                int temp = nums[eI];
                nums[eI] = nums[i];
                nums[i] = temp; 
                eI++; 
            }
        }
        
        return nums;
    }
}