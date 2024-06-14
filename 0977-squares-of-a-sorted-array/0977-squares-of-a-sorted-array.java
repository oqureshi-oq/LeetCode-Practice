/*
 * Time: O(n)
 * Space: O(n) if output array is taken into account, otherwise O(1)
 */ 
class Solution {
    public int[] sortedSquares(int[] nums) {
        if(nums == null)
            return null;
        
        int[] squaredNums = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        
        for(int i = nums.length-1; i >= 0; i--){
            int square; 
            
            if(Math.abs(nums[left]) > Math.abs(nums[right]))
                square = nums[left++];
            else
                square = nums[right--];
            
            squaredNums[i] = square * square; 
        }
        
        return squaredNums; 
    }
}