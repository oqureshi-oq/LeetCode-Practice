class Solution {
    public int rob(int[] nums) {
        if(nums == null)
            return 0;
        
        int[] dp = new int[nums.length+2];
        int currentMax = 0; 
        int nextDoorMax = 0;
        int nextNextDoorMax = 0; 
        
        for(int i = nums.length-1; i >= 0; i--){
            currentMax = Math.max(nums[i] + nextNextDoorMax, nextDoorMax);
            
            nextNextDoorMax = nextDoorMax; 
            nextDoorMax = currentMax; 
        }
        
        return currentMax; 
    }
}