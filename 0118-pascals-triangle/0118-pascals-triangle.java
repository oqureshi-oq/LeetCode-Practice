class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList(); 
        
        if(numRows <= 0)
            return list; 
        
        for(int row = 0; row < numRows; row++){
            List<Integer> rowList = new ArrayList(); 
            
            for(int i = 0; i <= row; i++){
                if(i == 0 || i == row)
                    rowList.add(1);
                else
                    rowList.add(list.get(row-1).get(i) + list.get(row-1).get(i-1));
            }
            
            list.add(rowList); 
        }
        
        return list; 
    }
}