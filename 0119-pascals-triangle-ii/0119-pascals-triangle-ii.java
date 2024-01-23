class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex < 0)
            return new ArrayList(0);
        
        List<Integer> list = new ArrayList(rowIndex+1);
        for(int i = 0; i <= rowIndex; i++){
            list.add(1); 
        }
        
        for(int row = 0; row <= rowIndex; row++){
            int prev = 1; 
            for(int i = 0; i <= row; i++){
                if(i == 0 || i == row){
                    list.set(i, 1);
                } else {
                    int temp = list.get(i);
                    list.set(i, list.get(i) + prev);
                    prev = temp; 
                }
            }
        }
        
        return list; 
    }
}