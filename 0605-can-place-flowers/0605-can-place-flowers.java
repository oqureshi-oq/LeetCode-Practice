class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed == null || flowerbed.length < n)
            return false; 
        
        for(int i = 0; i < flowerbed.length; i++){
            if(flowerbed[i] == 1)
                continue; 
            
            boolean isLeftEmpty = i == 0 ? true: flowerbed[i-1] == 0;
            boolean isRightEmpty = i == flowerbed.length-1 ? true: flowerbed[i+1] == 0;
            
            if(isLeftEmpty && isRightEmpty){
                n--; 
                i++; 
            }
        }
        
        return n <= 0; 
    }
}