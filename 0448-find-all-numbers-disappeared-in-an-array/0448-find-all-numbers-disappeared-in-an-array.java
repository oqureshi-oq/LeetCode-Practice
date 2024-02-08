class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums == null)
            return new LinkedList(); 
        
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] > 0)
                nums[index] *= -1; 
        }
        
        List<Integer> list = new LinkedList();
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0)
                list.add(i+1);
            else
                nums[i] *= -1; 
        }
        
        return list; 
    }
}