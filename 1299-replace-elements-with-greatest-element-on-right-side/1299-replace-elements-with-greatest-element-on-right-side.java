class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr == null)
            return new int[0];
        
        int[] ans = new int[arr.length];
        
        int max = -1;
        
        for(int i = arr.length-1; i >= 0; i--){
            int temp = arr[i];
            ans[i] = max; 
            max = Math.max(temp, max); 
        }
        
        return ans; 
    }
}