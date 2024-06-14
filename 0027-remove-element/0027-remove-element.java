/*
 * Time: O(n)
 * Space: O(1)
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums == null)
            return 0;
        
        int k = 0;
        int n = nums.length; 
        
        while(k < n){
            if(nums[k] == val){
                nums[k] = nums[n-1];
                n--;
            } else {
                k++; 
            }
        }
        
        return n; 
    }
}