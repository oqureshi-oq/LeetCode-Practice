class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        if(arr == null || arr.length == 0 || k <= 0 || k > arr.length) 
            return new ArrayList();
        
        int closestIndex = getClosestIndex(arr, x);
        int left = closestIndex;
        int right = closestIndex;
        
        while(right - left + 1 < k){
            if(left-1 >= 0 && right+1 < arr.length){
                if(Math.abs(arr[left-1] - x) <= Math.abs(arr[right+1] - x))
                    left--;
                else
                    right++; 
            } else if(left-1 >= 0)
                left--;
            else
                right++; 
        }
        
        List<Integer> list = new ArrayList(); 
        for(int i = left; i <= right; i++){
            list.add(arr[i]);
        }
        
        return list; 
    }
    
    public int getClosestIndex(int[] arr, int x){
        if(arr == null || arr.length == 0) return -1;
        
        int left = 0;
        int right = arr.length - 1;
        int closestIndex = 0;
        
        while(left <= right){
            int mid = left + ((right - left) >> 1);
            
            int currDiff = Math.abs(x - arr[closestIndex]);
            int midDiff = Math.abs(x - arr[mid]); 
            
            if(midDiff < currDiff || (midDiff == currDiff && mid < closestIndex))
                closestIndex = mid;
            
            if(arr[mid] == x)
                break;
            else if(arr[mid] < x)
                left = mid+1;
            else
                right = mid-1;
        }
        
        return closestIndex; 
    }
}