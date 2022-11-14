class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed == null || flowerbed.length < n)
            return false; 
        
        for(int i = 0; n > 0 && i < flowerbed.length; i++){
            boolean isLeftEmpty = i == 0 || flowerbed[i-1] == 0; 
            boolean isRightEmpty = i == flowerbed.length-1 || flowerbed[i+1] == 0;
            if(flowerbed[i] == 0 && isLeftEmpty && isRightEmpty){
                n--;
                i++; 
            }
        }
        
        return n == 0; 
    }
}