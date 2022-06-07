class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;
        
        while(left <= right){
            int mid = left + ((right - left) >> 1); 
            
            if(mid > num/mid){
                right = mid-1;
            } else {
                if(mid == num/mid && num % mid == 0) return true;
                if(mid + 1 > num/(mid+1)) return false;
                left = mid+1; 
            }
        }
        
        return false; 
    }
}