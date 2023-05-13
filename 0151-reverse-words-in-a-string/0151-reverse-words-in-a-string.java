class Solution {
    public String reverseWords(String s) {
       if(s == null)
           return "";
        
        int left = 0;
        while(left < s.length() && s.charAt(left) == ' ')
            left++;
        
        int right = s.length()-1;
        while(right >= 0 && s.charAt(right) == ' ')
            right--;
        
        char[] arr = s.toCharArray(); 
        
        reverse(arr, left, right);
        
        int l = left;
        int r = left;
        StringBuilder sb = new StringBuilder(); 
        
        while(r < arr.length){
            while(r < arr.length && arr[r] != ' ')
                r++;
            
            reverse(arr, l, r-1);
            
            while(l < r)
                sb.append(arr[l++]);
            
            sb.append(' ');
            
            while(r < arr.length && arr[r] == ' ')
                r++;
            
            l = r; 
        }
        
        return sb.substring(0, sb.length()-1);
    }
    
    public void reverse(char[] arr, int left, int right){
        if(arr == null || left < 0 || right >= arr.length)
            return;
        
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}