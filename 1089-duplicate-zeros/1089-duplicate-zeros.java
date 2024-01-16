class Solution {
    public void duplicateZeros(int[] arr) {
        if(arr == null)
            return;
        
        int[] ans = new int[arr.length];
        
        for(int read = 0, write = 0; write < arr.length; read++){
            ans[write++] = arr[read];
            if(write < arr.length && arr[read] == 0)
                ans[write++] = arr[read];
        }
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = ans[i];
        }
    }
}


