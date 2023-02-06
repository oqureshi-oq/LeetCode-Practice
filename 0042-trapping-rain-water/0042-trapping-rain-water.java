class Solution {
    public int trap(int[] height) {
        if(height == null)
            return 0;
        
        int leftMax = height[0];
        int rightMax = height[height.length-1];
        int left = 0;
        int right = height.length-1; 
        int rain = 0; 
        
        while(left < right){
            if(leftMax < rightMax){
                rain += leftMax - height[left];
                leftMax = Math.max(leftMax, height[++left]); 
            } else {
                rain += rightMax - height[right];
                rightMax = Math.max(rightMax, height[--right]); 
            }
        }
        
        return rain; 
    }
}