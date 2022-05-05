class Solution {
    public String reverseWords(String s) {
        if(s == null) return null; 
        
        char[] arr = s.toCharArray();
        
        reverse(arr, 0, arr.length-1); 
        
        int start = 0; 
        while(start < arr.length && arr[start] == ' ') 
            start++; 
        
        int end = arr.length - 1; 
        while(end >= 0 && arr[end] == ' ')
            end--; 
        
        int i = start; 
        int j = start; 
        while(i <= end){ 
            while(i <= end && arr[i] != ' ')
                i++; 
            
            reverse(arr, j, i-1); 
            
            while(i <= end && arr[i] == ' ')
                i++; 
            
            j = i;
        }
        
        
        StringBuilder str = new StringBuilder(); 
        for(int k = start; k <= end; ){
            if(arr[k] != ' ')
                str.append(arr[k++]);
            
            if(k <= end && arr[k] == ' '){
                str.append(' ');
                while(k <= end && arr[k] == ' ')
                    k++; 
            }
        }
     
        return str.toString(); 
    }
    
    public void reverse(char[] arr, int left, int right){
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++; 
            right--; 
        }
    }
}