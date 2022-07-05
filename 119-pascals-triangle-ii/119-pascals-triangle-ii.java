class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex < 0) return new ArrayList(); 
        
        int[] arr = new int[rowIndex+1]; 
        
        for(int i = 0; i <= rowIndex; i++){
            int prev = 1; 
            
            for(int j = 0; j < i+1; j++){
                if(j == 0 || j == i){
                    arr[j] = 1;
                    prev = 1; 
                } else {
                    int temp = arr[j]; 
                    arr[j] += prev; 
                    prev = temp; 
                }
            }
        }
        
        List<Integer> list = new ArrayList();
        
        for(int n: arr){
            list.add(n); 
        }
        
        return list; 
    }
}