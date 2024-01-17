class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums == null)
            return null; 
        
        int evenIndex = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                int temp = nums[i];
                nums[i] = nums[evenIndex]; 
                nums[evenIndex] = temp; 
                
                evenIndex++; 
            }
        }
        
        return nums; 
    }
}