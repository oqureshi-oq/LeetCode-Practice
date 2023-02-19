class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        if(arr == null)
            return 0;
        
        double sum = 0; 
        int count = 0;
        
        for(int left = 0, right = 0; right < arr.length; right++){
            sum += arr[right]; 
            
            if(right - left + 1 > k)
                sum -= arr[left++]; 
            
            if(right - left + 1 == k && sum / k >= threshold)
                count++; 
        }
        
        return count; 
    }
}