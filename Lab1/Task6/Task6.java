package Lab1.Task6;

public class Task6 {
    public static void main(String[] args)
    {
        final int[][] array1 = {
                { 1, 3, -2 },
                { 2, 4, -1 },
                { -1, 3, 4 }
        };

        final int[][] array2 = {
                { -5, 4, 3},
                { 1, 1, 2 },
                { -1, 3, -2}
        };

        final Task6 matrix = new Task6();
        System.out.println ("Матриця 1");
        matrix.printMatrix (array1);
        System.out.println ("\nМатриця 2");
        matrix.printMatrix (array2);

        System.out.println ("\nПомножена матриця");
        matrix.printMatrix(matrix.multiplication(array1, array2));
    }

    private void printMatrix(final int [][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " "); }
            System.out.println();
        }
    }
    private int[][] multiplication(final int[][] array1, final int[][] array2)
    {
        int r1, r2, c1, c2;
        r1 = array1.length;
        c1 = array1[0].length;

        r2 = array2.length;
        c2 = array2[0].length;

        int[][] result;
        if (c1 != r2)
        {
            System.out.println("Error!");
            result = new int[0][0];
        }
        else
        {
            result = new int[r1][c2];

            for (int i = 0; i < r1; i++)
            {
                for (int j = 0; j < c2; j++)
                {
                    for (int k = 0; k < c1; k++)
                    {
                        result[i][j] += array1[i][k] * array2[k][j];
                    }
                }
            }
        }

        return result;
    }

}

