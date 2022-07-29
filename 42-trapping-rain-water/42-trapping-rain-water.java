class Solution {
    public int trap(int[] height) {
        if(height == null)
            return -1;
        
        int rainfall = 0;
        int left = 0;
        int right = 0; 
        int i = 0; 
        
        while(i < height.length){
            while(i < height.length && height[i] == 0)
                i++; 
            
            left = i;
            i++; 
            right = i; 
            
            while(i < height.length && height[left] > height[i]){
                if(height[i] >= height[right])
                    right = i;  
                i++;
            }
            
            if(i < height.length)
                right = i;
            
            for(int j = left+1; j < right; j++){
                rainfall += Math.min(height[left], height[right]) - height[j]; 
            }
            
            i = right; 
        }
        
        return rainfall; 
    }
}