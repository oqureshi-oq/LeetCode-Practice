class Solution {
    public int thirdMax(int[] nums) {
        if(nums == null)
            return Integer.MIN_VALUE; 
        
        Integer first = null;
        Integer second = null; 
        Integer third = null; 
        
        for(Integer n: nums){
            if(n.equals(first) || n.equals(second) || n.equals(third))
                continue;
            
            if(first == null || n > first){
                third = second;
                second = first;
                first = n;
            } else if(second == null || n > second){
                third = second;
                second = n;
            } else if(third == null || n > third){
                third = n;
            }
        }
        
        return third != null ? third: first; 
    }
}