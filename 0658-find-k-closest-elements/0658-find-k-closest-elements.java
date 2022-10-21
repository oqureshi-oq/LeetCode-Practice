class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        if(arr == null || k <= 0 || k > arr.length)
            return new ArrayList(); 
        
        int left = 0;
        int right = arr.length-1; 
        int closestIndex = 0; 
        int closestDifference = Math.abs(arr[closestIndex] - x); 
        
        while(left <= right){
            int mid = left + (right - left)/2; 
            int difference = Math.abs(arr[mid] - x); 
            
            if(difference < closestDifference || difference == closestDifference && mid < closestIndex){
                closestIndex = mid;
                closestDifference = difference; 
            }
            
            if(arr[mid] == x)
                break; 
            else if(arr[mid] < x)
                left = mid+1;
            else
                right = mid-1; 
        }
        
        left = closestIndex; 
        right = closestIndex; 
        
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
}