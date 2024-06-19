class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null)
            return new ArrayList(0);
        
        int m = matrix.length;
        int n = matrix[0].length;
        int topRow = 0;
        int bottomRow = m-1;
        int leftCol = 0;
        int rightCol = n-1;
        List<Integer> list = new ArrayList(m*n);
        int i = 0;
        
        while(i < m*n){
            for(int col = leftCol; i < m*n && col <= rightCol; col++){
                list.add(matrix[topRow][col]);
                i++;
            }
            
            topRow++;
            
            for(int row = topRow; i < m*n && row <= bottomRow; row++){
                list.add(matrix[row][rightCol]);
                i++;
            }
            
            rightCol--;
            
            for(int col = rightCol; i < m*n && leftCol <= col; col--){
                list.add(matrix[bottomRow][col]);
                i++;
            }
            
            bottomRow--;
            
            for(int row = bottomRow; i < m*n && topRow <= row; row--){
                list.add(matrix[row][leftCol]);
                i++;
            }
            
            leftCol++;
        }
        
        return list; 
    }
}