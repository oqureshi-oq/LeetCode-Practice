// Time: O(n)
// Space: O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null)
            return 0;
        
        int k = 0;
        
        for(int n: nums){
            if(k == 0 || nums[k-1] != n)
                nums[k++] = n;
        }
        
        return k; 
    }
}