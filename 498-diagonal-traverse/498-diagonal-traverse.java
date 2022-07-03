class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null) return new int[0];
        
        int m = mat.length; 
        int n = mat[0].length; 
        int row = 0;
        int col = 0; 
        boolean goingUp = true; 
        int[] ans = new int[m*n];
        
        for(int i = 0; i < m*n; i++){
            ans[i] = mat[row][col];
            
            if(goingUp){
                if(row-1 < 0 && col+1 < n){
                    col++; 
                    goingUp = false; 
                } else if(col+1 >= n){
                    row++; 
                    goingUp = false; 
                } else {
                    row--;
                    col++; 
                }
            } else {
                if(col-1 < 0 && row+1 < m){
                    row++;
                    goingUp = true; 
                } else if(row+1 >= m){
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

