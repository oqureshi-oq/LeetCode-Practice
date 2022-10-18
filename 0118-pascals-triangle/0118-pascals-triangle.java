class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows <= 0)
            return new ArrayList(); 
        
        List<List<Integer>> list = new ArrayList(); 
        
        for(int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList(); 
            
            for(int j = i; j >= 0; j--){
                if(j == 0 || j == i)
                    row.add(1);
                else
                    row.add(list.get(i-1).get(j) + list.get(i-1).get(j-1));
            }
            
            list.add(row);
        }
        
        return list; 
    }
}