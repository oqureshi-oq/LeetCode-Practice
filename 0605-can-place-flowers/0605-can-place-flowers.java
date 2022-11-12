class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed == null || n > flowerbed.length)
            return false; 
        
        int i = 0;
        int count = 0;
        
        while(i < flowerbed.length){
            boolean isLeftEmpty = i == 0 ? true: flowerbed[i-1] == 0; 
            boolean isRightEmpty = i == flowerbed.length-1 ? true: flowerbed[i+1] == 0;
            
            if(flowerbed[i] == 0 && isLeftEmpty && isRightEmpty){
                count++; 
                i++; 
            }
            
            i++;
        }
        
        return count >= n; 
    }
}