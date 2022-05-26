class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board == null) return false; 
        
        Set<String> set = new HashSet(); 
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] != '.'){
                    if(set.contains(board[i][j] + "row:" + i) ||
                      set.contains(board[i][j] + "col:" + j) ||
                        set.contains(board[i][j] + String.valueOf(i/3) + String.valueOf(j/3)))
                        return false;
                    
                    set.add(board[i][j] + "row:" + i); 
                    set.add(board[i][j] + "col:" + j); 
                    set.add(board[i][j] + String.valueOf(i/3) + String.valueOf(j/3)); 
                }
            }
        }
        
        return true; 
    }
}