class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        if(piles == null)
            return -1; 
        
        int left = 1; 
        int right = piles[0];
                
        for(int n: piles){
            right = Math.max(right, n); 
        }
        
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