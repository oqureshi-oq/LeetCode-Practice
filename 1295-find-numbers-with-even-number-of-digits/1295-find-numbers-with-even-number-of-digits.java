/* 
 * Time: O(n log M) where n is number of elements in n and M is largest number in nums
 * Space: O(1)
 */ 
class Solution {
    public int findNumbers(int[] nums) {
        if(nums == null)
            return 0;
        
        int count = 0;
        
        for(int n: nums){
            int numDigits = (int) Math.log10(Math.abs(n)) + 1;
            if(numDigits % 2 == 0)
                count++; 
        }
        
        return count; 
    }
}