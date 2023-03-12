class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex < 0)
            return new ArrayList(); 
        
        Integer[] row = new Integer[rowIndex+1]; 
        
        for(int i = 0; i <= rowIndex; i++){
            Integer prev = 1; 
            
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i) {
                    row[j] = 1;
                } else {
                    int temp = row[j];
                    row[j] += prev;
                    prev = temp; 
                }
            }
        }
        
        return Arrays.asList(row); 
    }
}