class Solution {
    public int trap(int[] height) {
        if(height == null)
            return 0;
        
        int left = 0;
        int right = 0;
        int max = 0;
        
        while(right < height.length){
            while(right < height.length && (left == right || height[left] > height[right]))
                right++;
            
            if(right == height.length)
                break; 
            
            int wallHeight = height[left];
            
            while(left < right){
                max += wallHeight - height[left];
                left++; 
            }
        }
        
        int leftEnd = left;
        left = right = height.length-1; 
        
        while(leftEnd <= left){
            while(leftEnd <= left && (left == right || height[left] < height[right]))
                left--;
            
            if(left < leftEnd)
                break; 
            
            int wallHeight = height[right];
            
            while(left < right){
                max += wallHeight - height[right];
                right--;
            }
        }
        
        return max; 
    }
}