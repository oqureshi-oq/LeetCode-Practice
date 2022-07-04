class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null) return new int[0];
        
        int m = mat.length; 
        int n = mat[0].length; 
        int row = 0;
        int col = 0; 
        int[] ans = new int[m*n];
        boolean goingUp = true; 
        
        for(int i = 0; i < m*n; i++){
            ans[i] = mat[row][col];
            
            if(goingUp){
                if(row == 0 && col+1 < n){
                    col++; 
                    goingUp = false; 
                } else if(col == n-1 && row+1 < m){
                    row++; 
                    goingUp = false;
                } else {
                    row--;
                    col++; 
                }
            } else {
                if(col == 0 && row+1 < m){
                    row++; 
                    goingUp = true;
                } else if(row == m-1 && col+1 < n){
                    col++;
                    goingUp = true; 
                } else {
                    row++; 
                    col--; 
                }
            }
        }
        
        return ans; 
    }
}