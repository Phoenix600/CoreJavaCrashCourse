package arraysInJava;

import java.util.Arrays;

public class Example10 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };


        System.out.println("Matrix[0][0] : " + matrix[0][0]);
        System.out.println("Matrix[0][1] : " + matrix[0][1]);
        System.out.println("Matrix[0][2] : " + matrix[0][2]);
        System.out.println("Matrix[1][0] : " + matrix[1][0]);
        System.out.println("Matrix[1][1] : " + matrix[1][1]);
        System.out.println("Matrix[1][2] : " + matrix[1][2]);
        System.out.println("Matrix[2][0] : " + matrix[2][0]);
        System.out.println("Matrix[2][1] : " + matrix[2][1]);
        System.out.println("Matrix[2][2] : " + matrix[2][2]);


        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));

        for (int i=0; i<matrix.length; i++)
        {
            System.out.println(Arrays.toString(matrix[i]));
        }

        // Nested For Loop
        for(int i=0; i<matrix.length; i++)
        {
            for(int j=0; j<matrix[i].length; j++)
            {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }


    }
}
