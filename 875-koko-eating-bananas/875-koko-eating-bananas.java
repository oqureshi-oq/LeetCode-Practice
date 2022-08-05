class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        if(piles == null || piles.length == 0)
            return -1;
        
        int max = piles[0];
        
        for(int n: piles){
            max = Math.max(max, n);
        }
        
        int left = 1;
        int right = max; 
        
        while(left < right){
            int mid = left + (right - left)/2; 
            
            int hours = 0;
            for(int n: piles){
                hours += n/mid;
                if(n % mid != 0)
                    hours += 1; 
            }
            
            if(hours <= h)
                right = mid;
            else
                left = mid+1;
        }
        
        return left; 
    }
}