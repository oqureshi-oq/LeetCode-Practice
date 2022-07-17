class Solution {
    public boolean isPerfectSquare(int num) {
        if(num <= 0) return false; 
        
        int left = 1;
        int right = num; 
        
        while(left <= right){
            int mid = left + (right - left)/2;
            
            if(num % mid == 0 && mid == num/mid)
                return true;
            else if(num/mid < mid)
                right = mid-1;
            else
                left = mid+1;
        }
        
        return false; 
    }
}