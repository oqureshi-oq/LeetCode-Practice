class Solution {
    public int[] sortArrayByParity(int[] nums) {
       if(nums == null)
           return null;
        
        int nextEvenIndex = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                int temp = nums[nextEvenIndex];
                nums[nextEvenIndex] = nums[i];
                nums[i] = temp; 
                nextEvenIndex++; 
            }
        }
        
        return nums;
    }
}