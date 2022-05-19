class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null) return null; 
        
        List<Integer> list = new ArrayList(); 
        int m = matrix.length;
        int n = matrix[0].length; 
        int leftCol = 0; 
        int rightCol = n-1; 
        int topRow = 0; 
        int bottomRow = m-1; 
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
            
            for(int col = rightCol; i < m*n && col >= leftCol; col--){
                list.add(matrix[bottomRow][col]);
                i++; 
            }
            
            bottomRow--; 
            
            for(int row = bottomRow; i < m*n && row >= topRow; row--){
                list.add(matrix[row][leftCol]);
                i++; 
            }
            
            leftCol++; 
        }
        
        return list; 
    }
}