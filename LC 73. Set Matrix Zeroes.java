class Solution {
    public void setZeroes(int[][] matrix) {
        // making variable for storing if row0 or col0 has zero
        boolean row0 = false;
        boolean col0 = false;
        
        for(int i=0;i<matrix[0].length;i++) {
            if(matrix[0][i]==0) {
                row0 = true;
                break;
            }
        }
        for(int i=0;i<matrix.length;i++) {
            if(matrix[i][0]==0) {
                col0 = true;
                break;
            }
        }

        // checking for (1,1) to last el
        for(int row=1;row<matrix.length;row++) {
            for(int col = 1;col<matrix[0].length;col++) {
                if(matrix[row][col]==0) {
                    matrix[0][col] = 0;
                    matrix[row][0] = 0;
                }
            }
        }
        // marking respective row and col in which 1st row or col is set to zero
        for(int row=1;row<matrix.length;row++) {
            for(int col = 1;col<matrix[0].length;col++) {
                if(matrix[0][col]==0 || matrix[row][0]==0) {
                    matrix[row][col] = 0;
                }
            }
        }
        // if row0 is true making entire row as 0 , same with col0
        if(row0==true) {
            for(int i=0;i<matrix[0].length;i++) {
                matrix[0][i] = 0;
            }
        }

        if(col0==true) {
            for(int i=0;i<matrix.length;i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
