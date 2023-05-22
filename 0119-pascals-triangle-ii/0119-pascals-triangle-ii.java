class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex < 0)
            return new ArrayList(); 
        
        int[] ans = new int[rowIndex+1];
        
        for(int i = 0; i <= rowIndex; i++){
            int prev = 1; 
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    ans[j] = 1;
                } else {
                    int temp = ans[j];
                    ans[j] += prev; 
                    prev = temp; 
                }
            }
        }
        
        List<Integer> list = new ArrayList();
        
        for(int n: ans){
            list.add(n);
        }
        
        return list; 
    }
}