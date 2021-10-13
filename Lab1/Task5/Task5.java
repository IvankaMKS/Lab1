package Lab1.Task5;

import java.util.Arrays;

public class Task5 {
    private int[][] matrix;

    public Task5(final int rol, int col){
        this.matrix = newMatrix (rol, col);
    }

    public int [][] newMatrix (final int rol, final int col){
        int [][] matrix = new int[rol][col];

        for (int i=0; i < matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    public int [][] transposition(){
        final int [][] array = new int [matrix[0].length][matrix.length];
        for(int i = 0; i < matrix[0].length; i++){
            for(int j = 0; j < matrix.length; j++){
                array[i][j] = matrix[j][i];
            }
        }
        return array;
    }

    public void printMatrix(){
        for(int i= 0; i < matrix.length; i++){
            for(int j=0; j < matrix[0].length; j++){
                System.out.println(matrix[i][j] );
            }
            System.out.println();
        }
    }


    public static void main(final String[] args){
        final Task5 mat = new Task5(3, 4);
        final int[][] arrayTrans = mat.transposition();
        mat.printMatrix();
        System.out.println(Arrays.deepToString(arrayTrans));
    }

}
