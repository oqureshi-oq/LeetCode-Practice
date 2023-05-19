class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original == null || original.length != m*n)
            return new int[0][0];
        
        int[][] ans = new int[m][n];
        
        int i = 0; 
        for(int row = 0; row < m; row++){
            for(int col = 0; col < n; col++){
                ans[row][col] = original[i++];
            }
        }
        
        return ans; 
    }
}