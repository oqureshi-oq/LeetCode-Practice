class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed == null || n < 0)
            return false; 
        
        int count = 0; 
        
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 1){
                i++; 
                continue; 
            }
            
            boolean left = i == 0 || flowerbed[i-1] != 1 ? true: false; 
            boolean right = i == flowerbed.length-1 || flowerbed[i+1] != 1 ? true: false;
            
            if(left && right){
                count++;
                i++; 
            }
                
        }
        
        return count >= n; 
    }
}