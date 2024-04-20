class Solution {
    public int maxArea(int[] height) {
        if(height == null)
            return 0;
        
        int left = 0;
        int right = height.length-1; 
        int area = 0; 
        
        while(left < right){
            int width = right - left; 
            area = Math.max(area, Math.min(height[left], height[right]) * width);
            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        
        return area; 
    }
}