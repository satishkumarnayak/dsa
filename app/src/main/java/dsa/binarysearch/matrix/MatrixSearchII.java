package dsa.binarysearch.matrix;

public class MatrixSearchII {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;   // rows
        int n = matrix[0].length; //cols

        int rows = 0 ;
        int cols = n - 1;
        while((rows >= 0 && rows < m) && ( cols >= 0 && cols < n)){
            if(target == matrix[rows][cols]){
                return true;
            } else if( target > matrix[rows][cols]){
                rows++;
            } else {
                cols--;
            }
        }

        return false;

    }
}
