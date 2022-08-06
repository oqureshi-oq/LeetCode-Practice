class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        if(piles == null || h < piles.length)
            return -1;
        
        int left = 1;
        int right = getMax(piles); 
        
        while(left < right){
            int mid = left + (right - left)/2;
            
            int hours = 0;
            
            for(int n: piles){
                hours += Math.ceil((double) n / mid);  
            }
            
            if(hours <= h)
                right = mid;
            else
                left = mid+1;
        }
        
        return left; 
    }
    
    public int getMax(int[] arr){
        if(arr == null || arr.length == 0)
            return -1;
        
        int max = arr[0];
        
        for(int n: arr){
            max = Math.max(max, n);
        }
        
        return max; 
    }
}