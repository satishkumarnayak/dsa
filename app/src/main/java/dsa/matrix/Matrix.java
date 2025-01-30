package dsa.matrix;

public class Matrix {

    public static void main(String[] args) {

        int[][] matrixA = {
                {2, 4, 4},
                {7, 3, 9},
                {5, 2, 1}
        };

        int[][] matrixB = {
                {2, 1, 2},
                {3, 3, 2},
                {6, 2, 3}
        };

     //   int[][] res = addMatrix(matrixA,matrixB);

        displayMatrix(matrixA);
        System.out.println("-------------");
        int[][] res =  transpose(matrixA);


        displayMatrix(res);



    }

    private static int[][] transpose(int[][] matrixA) {
        int [][] resultMatrix = new int[3][3];
        int rows = matrixA.length;
        int cols = matrixA[0].length;

        for(int i = 0 ; i < rows; i++){
            for(int j = 0; j < cols; j++){
                resultMatrix[i][j]=matrixA[j][i];
            }
        }

        return resultMatrix;


    }

    private static void displayMatrix(int[][] res) {

       for(int row[] : res){
           for(int val : row){
               System.out.print(" "+val);
           }
           System.out.println("");
       }

    }

    private static int[][] addMatrix(int[][] matA,int[][] matB) {
        int [][] resultMatrix = new int[3][3];

        int rows = matA.length;
        int cols = matA[0].length;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                resultMatrix[i][j] = matA[i][j] + matB[i][j];
            }
        }
        return resultMatrix;
    }
}
