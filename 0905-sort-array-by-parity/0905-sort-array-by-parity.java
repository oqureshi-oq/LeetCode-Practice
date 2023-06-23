class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums == null)
            return null; 
        
        int eIndex = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                int temp = nums[eIndex];
                nums[eIndex] = nums[i];
                nums[i] = temp;
                eIndex++;
            }
        }
        
        return nums; 
    }
}