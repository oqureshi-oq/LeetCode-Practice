class Solution {
    public int[] sortedSquares(int[] nums) {
        if(nums == null) return null;
        
        for(int i = 0; i < nums.length; i++){
            nums[i] *= nums[i];
        }
        
        Arrays.sort(nums);
        
        return nums; 
    }
}