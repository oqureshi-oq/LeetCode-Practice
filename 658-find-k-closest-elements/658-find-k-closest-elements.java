class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        if(arr == null || k <= 0 || k > arr.length) return new ArrayList(); 
        
        int closestIndex = findClosestIndex(arr, x);
        int left = closestIndex;
        int right = closestIndex; 
        
        while(right - left + 1 < k){
            if(right + 1 < arr.length && left - 1 >= 0){
                if(Math.abs(arr[left-1] - x) <= Math.abs(arr[right+1] - x))
                    left--;
                else
                    right++;
            } else if (right + 1 < arr.length)
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
    
    public int findClosestIndex(int[] arr, int x){
        if(arr == null) return -1;
        
        int left = 0;
        int right = arr.length - 1;
        int index = 0;
        
        while(left <= right){
            int mid = left + (right - left)/2; 
            
            if(arr[mid] == x)
                return mid; 
            
            int midDiff = Math.abs(arr[mid] - x);
            int indexDiff = Math.abs(arr[index] - x); 
            
            if(midDiff < indexDiff || midDiff == indexDiff && mid < index)
                index = mid;
            
            if(arr[mid] < x)
                left = mid+1;
            else
                right = mid-1;
        }
        
        return index; 
    }
}