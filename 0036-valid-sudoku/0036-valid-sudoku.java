class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board == null)
            return false; 
        
        Set[] rows = new Set[9];
        Set[] cols = new Set[9];
        Set[] boxes = new Set[9];
        
        for(int i = 0; i < 9; i++){
            rows[i] = new HashSet();
            cols[i] = new HashSet(); 
            boxes[i] = new HashSet(); 
        }
        
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){                
                char value = board[i][j]; 
                
                if(value == '.')
                    continue; 
                
                if(!rows[i].add(value) || !cols[j].add(value) || !boxes[i/3 * 3 + j/3].add(value))
                    return false;
            }
        }
        
        return true; 
    }
}