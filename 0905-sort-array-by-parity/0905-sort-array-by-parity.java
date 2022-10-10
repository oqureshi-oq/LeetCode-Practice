class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums == null)
            return null;
        
        int left = 0;
        int right = nums.length - 1; 
        
        while(left < right){
            if(nums[left] % 2 == 0)
                left++; 
            else if(nums[right] % 2 != 0)
                right--;
            else{
                int temp = nums[left]; 
                nums[left] = nums[right];
                nums[right] = temp; 
                left++; 
                right--; 
            }
        }
        
        return nums; 
    }
}