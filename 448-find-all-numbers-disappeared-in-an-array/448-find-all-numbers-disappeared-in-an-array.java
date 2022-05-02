class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums == null) return null;
        
        for(int n: nums){
            if(nums[Math.abs(n)-1] > 0)
                nums[Math.abs(n)-1] *= -1; 
        }
        
        List<Integer> list = new ArrayList(); 
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0)
                list.add(i+1); 
            else
                nums[i] *= -1; 
        }
        
        return list; 
    }
}