class Solution {
    public int maxArea(int[] height) {
        if(height == null)
            return 0;
        
        int left = 0;
        int right = height.length-1; 
        int max = 0;
        
        while(left < right){
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            
            max = Math.max(max, h*w); 
            
            if(height[left] < height[right])
                left++;
            else
                right--; 
        }
        
        return max; 
    }
}