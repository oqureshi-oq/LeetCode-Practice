class Solution {
    public int longestOnes(int[] nums, int k) {
        if(nums == null) return -1;

        int max = 0;
        for(int i = 0, j = 0; j < nums.length; j++){
            if(nums[j] == 0)
                k--; 
            
            while(k < 0){
                if(nums[i] == 0)
                    k++;
                i++; 
            }

            max = Math.max(max, j-i+1); 
        }

        return max; 
    }
}