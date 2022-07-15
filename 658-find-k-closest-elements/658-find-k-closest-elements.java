class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        if(arr == null || k > arr.length || k <= 0) 
            return new ArrayList(); 
        
        int xIndex = binarySearch(arr, x); 
        
        if(xIndex == -1)
            return new ArrayList(); 
        
        int left = xIndex;
        int right = xIndex;
        
        while(right - left + 1 != k){
            if(right + 1 < arr.length && left - 1 >= 0){
                if(Math.abs(arr[left-1] - x) <= Math.abs(arr[right+1] - x))
                    left--;
                else
                    right++; 
            } else if(right+1 < arr.length)
                right++;
            else
                left--; 
        }
        
        List<Integer> list = new ArrayList(); 
        
        for(int i = left; i <= right; i++){
            list.add(arr[i]);
        }
        
        return list; 
    }
    
    public int binarySearch(int[] arr, int x){
        if(arr == null) return -1;
        
        int left = 0;
        int right = arr.length-1;
        
        while(left <= right){
            int mid = left + (right - left)/2;
            
            if(arr[mid] == x)
                return mid; 
            else if(arr[mid] < x)
                left = mid+1;
            else
                right = mid-1; 
        }
        
        if(left < arr.length && right >= 0){
            if(Math.abs(arr[right] - x) <= Math.abs(arr[left] - x))
                return right;
            else
                return left; 
        }
        
        if(left >= arr.length) return right;
        return left; 
    }
}