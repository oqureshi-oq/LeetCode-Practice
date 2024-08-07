// Time: O(n)
// Space: O(1)
class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums == null)
            return 0;
        
        int k = 0;
        
        for(int n: nums){
            if(n != val)
                nums[k++] = n;
        }
        
        return k; 
    }
}