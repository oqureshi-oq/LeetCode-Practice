class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex < 0)
            return new ArrayList(); 
        
        int[] ans = new int[rowIndex+1];  
        
        for(int i = 0; i <= rowIndex; i++){
            for(int j = i; j >= 0; j--){
                if(j == i || j == 0)
                    ans[j] = 1; 
                else
                    ans[j] += ans[j-1]; 
            }
        }
        
        List<Integer> list = new ArrayList(); 
        
        for(int n: ans){
            list.add(n); 
        }
        
        return list; 
    }
}