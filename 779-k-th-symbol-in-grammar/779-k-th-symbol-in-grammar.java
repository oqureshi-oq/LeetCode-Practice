class Solution {
    public int kthGrammar(int n, int k) {
        return kthGrammar(n, k, 0, (int)Math.pow(2,n-1));
    }
    
    public int kthGrammar(int n, int k, int prev, int length){
        if(n == 1) return prev; 
        
        if(k > length / 2){
            prev = prev == 0 ? 1: 0;
            k -= length/2; 
        }
        
        length /= 2; 
        
        return kthGrammar(n-1, k, prev, length); 
    }
}

//         0
//        0 1
//      0 1 1 0