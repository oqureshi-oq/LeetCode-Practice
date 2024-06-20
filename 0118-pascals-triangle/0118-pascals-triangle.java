/*
 * Time: O(numRows^2)
 * Space: O(numRows^2) if output is taken into account
 */ 
class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows <= 0)
            return new ArrayList(0);
        
        List<List<Integer>> list = new ArrayList(numRows);
        
        for(int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList(i+1);
            
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i)
                    row.add(1);
                else
                    row.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
            }
            
            list.add(row);
        }
        
        return list; 
    }
}