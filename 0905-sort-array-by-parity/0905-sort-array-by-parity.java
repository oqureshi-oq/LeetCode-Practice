class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums == null)
            return new int[0];
        
        int left = 0;
        int right = nums.length-1; 
        
        while(left < right){
            if(nums[left] % 2 == 0)
                left++; 
            else if(nums[right] % 2 != 0)
                right--; 
            else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp; 
            }
        }
        
        return nums; 
    }
}