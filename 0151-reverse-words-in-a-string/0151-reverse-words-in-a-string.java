class Solution {
    public String reverseWords(String s) {
        if(s == null)
            return "";
        
        char[] arr = s.toCharArray(); 
        
        reverse(arr, 0, arr.length-1);
        
        int left = 0;
        int right = 0;
        StringBuilder sb = new StringBuilder(); 
        
        while(right < arr.length){
            while(right < arr.length && arr[right] == ' '){
                right++;
            }
            
            if(right == arr.length)
                break;
            
            left = right; 
            
            while(right < arr.length && arr[right] != ' ')
                right++;
            
            reverse(arr, left, right-1);
            
            while(left < right)
                sb.append(arr[left++]);
            
            sb.append(' '); 
        }
        
        return sb.toString().substring(0, sb.length()-1); 
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